package per.assignment.rectangle.service;

import per.assignment.rectangle.entity.Rectangle;

import java.util.List;

public interface RectangleService {
    void addRectangle(Rectangle rectangle);
    Rectangle findById(Rectangle rectangle);
    List<Rectangle> findAll();
    void updateRectangle(Rectangle rectangle);
    void deleteRectangle(Rectangle rectangle);
}
