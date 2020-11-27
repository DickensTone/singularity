import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import sql from '@/components/convertSql'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'convertSql',
      component: sql
    },
    {
      path: '/index',
      name: 'convertSql',
      component: sql
    },
    {
      path: '/vHelloWord',
      name: 'vueHelloWord',
      component: HelloWorld
    }
  ]
})
