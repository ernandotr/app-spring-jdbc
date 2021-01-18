package com.ernando.rezende.cluster.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ClusterMapper implements RowMapper<Cluster> {
    public Cluster mapRow(ResultSet rs, int rowNum) throws SQLException {
       return new Cluster(rs.getString("name"), rs.getInt("id"));
    }
}
