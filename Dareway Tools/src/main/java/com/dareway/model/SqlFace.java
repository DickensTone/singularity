package com.dareway.model;

import lombok.Data;
import org.springframework.context.annotation.Bean;

@Data
public class SqlFace {
    private String sql;
    private String java;
    private String origin;
    private String replace;
}
