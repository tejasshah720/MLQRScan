package com.my.mlqrscan;

import android.graphics.Bitmap;
import com.google.firebase.ml.common.FirebaseMLException;

import java.nio.ByteBuffer;

/**
 * Created by Tejas Shah on 23/11/18.
 */
public interface VisionImageProcessor {

    /** Processes the images with the underlying machine learning models. */
    void process(ByteBuffer data, FrameMetadata frameMetadata, GraphicOverlay graphicOverlay)
            throws FirebaseMLException;

    /** Processes the bitmap images. */
    void process(Bitmap bitmap, GraphicOverlay graphicOverlay);

    /** Stops the underlying machine learning model and release resources. */
    void stop();
}
