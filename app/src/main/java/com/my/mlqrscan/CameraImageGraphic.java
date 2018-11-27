package com.my.mlqrscan;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import com.my.mlqrscan.GraphicOverlay.Graphic;

/**
 * Created by Tejas Shah on 23/11/18.
 */
public class CameraImageGraphic extends Graphic {

    private final Bitmap bitmap;

    public CameraImageGraphic(GraphicOverlay overlay, Bitmap bitmap) {
        super(overlay);
        this.bitmap = bitmap;
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawBitmap(bitmap, null, new Rect(0, 0, canvas.getWidth(), canvas.getHeight()), null);
    }

}
