package com.squareup.picasso;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestHandler;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ResourceRequestHandler extends RequestHandler {
    private final Context context;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ResourceRequestHandler(Context context) {
        this.context = context;
    }

    private static Bitmap decodeResource(Resources resources, int i2, Request request) {
        BitmapFactory.Options createBitmapOptions = RequestHandler.createBitmapOptions(request);
        if (RequestHandler.requiresInSampleSize(createBitmapOptions)) {
            BitmapFactory.decodeResource(resources, i2, createBitmapOptions);
            RequestHandler.calculateInSampleSize(request.targetWidth, request.targetHeight, createBitmapOptions, request);
        }
        return BitmapFactory.decodeResource(resources, i2, createBitmapOptions);
    }

    @Override // com.squareup.picasso.RequestHandler
    public boolean canHandleRequest(Request request) {
        if (request.resourceId != 0) {
            return true;
        }
        return "android.resource".equals(request.uri.getScheme());
    }

    @Override // com.squareup.picasso.RequestHandler
    public RequestHandler.Result load(Request request, int i2) throws IOException {
        Resources resources = Utils.getResources(this.context, request);
        return new RequestHandler.Result(decodeResource(resources, Utils.getResourceId(resources, request), request), Picasso.LoadedFrom.DISK);
    }
}
