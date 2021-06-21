package per.assignment.rectangle.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import per.assignment.rectangle.entity.Rectangle;

import java.util.List;

@Mapper
public interface RectangleMapper {
    void insertRectangle(@Param("rectangle") Rectangle rectangle);
    Rectangle findById(@Param("rectangle") Rectangle rectangle);
    List<Rectangle> findAll();
    void updateRectangle(@Param("rectangle") Rectangle rectangle);
    void deleteRectangle(@Param("rectangle") Rectangle rectangle);
}
