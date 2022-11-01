package domain;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BlogStateHandler extends BaseTypeHandler<BlogState> {

    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, BlogState blogState, JdbcType jdbcType) throws SQLException {

    }

    @Override
    public BlogState getNullableResult(ResultSet resultSet, String s) throws SQLException {
        int state = resultSet.getInt("state");
        switch (state){
            case 0:
                return BlogState.ACTIVE;
            case 1:
                return BlogState.INACTIVE;
            case 2:
                return BlogState.CLOSED;
        }
        return null;
    }

    @Override
    public BlogState getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return null;
    }

    @Override
    public BlogState getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return null;
    }
}
