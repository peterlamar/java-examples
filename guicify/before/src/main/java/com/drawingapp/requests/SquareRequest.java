package com.drawingapp.requests;
import com.drawingapp.services.DrawShape;
import com.drawingapp.services.DrawSquare;

public class SquareRequest {
    DrawShape d;
    public SquareRequest(DrawShape d){
        this.d = d;
    }

    public void makeRequest(){
        d.draw();
    }
}
