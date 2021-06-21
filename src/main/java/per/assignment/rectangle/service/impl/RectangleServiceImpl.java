package per.assignment.rectangle.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import per.assignment.rectangle.entity.Rectangle;
import per.assignment.rectangle.mapper.RectangleMapper;
import per.assignment.rectangle.service.RectangleService;

import java.util.List;

@Service
public class RectangleServiceImpl implements RectangleService {

    @Autowired
    private RectangleMapper rectangleMapper;


    @Override
    public void addRectangle(Rectangle rectangle) {
        rectangleMapper.insertRectangle(rectangle);
    }

    @Override
    public Rectangle findById(Rectangle rectangle) {
        return rectangleMapper.findById(rectangle);
    }

    @Override
    public List<Rectangle> findAll() {
        return rectangleMapper.findAll();
    }

    @Override
    public void updateRectangle(Rectangle rectangle) {
        rectangleMapper.updateRectangle(rectangle);
    }

    @Override
    public void deleteRectangle(Rectangle rectangle) {
        rectangleMapper.deleteRectangle(rectangle);
    }
}
