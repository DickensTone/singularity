<template>
  <div class="container">
    <div class="row">
      <div class="col-xs-5 col-md-5">
        <span class="label label-primary">Input</span>
        <textarea class="form-control" rows="10" v-model="inputs"></textarea>
      </div>
      <div class="col-xs-1.5 col-md-1.5">
      <br>
      <br>
      <br>
      <br>
      <div class="dropdown">
        <div class="btn-group">
          <button type="button" class="btn btn-success dropdown-toggle " data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" >
            <span class="caret " >开始转换 </span>
          </button>
          <ul class="dropdown-menu">
            <li><a @click="getSqlFromJava" href="#">转换为SQL</a></li>
            <li><a href="#" @click="getJavaFromSql">转换为Java</a></li>
          </ul>
        </div>
      </div>
      </div>
      <div class="col-xs-5 col-md-5">
        <span class="label label-primary">Output</span>
        <textarea class="form-control" rows="10" v-model="outputs"></textarea>
      </div>
    </div>
  </div>
</template>
<script>
import axios from 'axios'
import 'bootstrap/dist/css/bootstrap.min.css'
import 'bootstrap/dist/js/bootstrap.min.js'
export default {
  name: 'requestSql',
  data () {
    return {
      inputs: '',
      outputs: ''
    }
  },
  methods: {
    getSqlFromJava () {
      axios
        .post('http://localhost:7999/getSqlFromJava', {
          method: 'toSQL',
          data: {
            str: this.inputs
          }
        })
        .then(res => {
          this.outputs = res.data.sql
          console.log(res)
        })
    },
    getJavaFromSql () {
      axios
        .get('http://localhost:7999/getSqlFromJava', {
          params: {
            method: 'toSQL'
          },
          headers: {}
        })
        .then(res => console.log(res))
    },
    test () {
      axios
        .get('http://localhost:7999/test', {
          params: {
            method: 'toSQL'
          },
          headers: {}
        })
        .then(res => console.log(res))
    }
  }
}
</script>
