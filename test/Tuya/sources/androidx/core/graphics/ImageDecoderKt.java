package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import androidx.annotation.RequiresApi;

@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes3.dex */
public final class ImageDecoderKt {
    @RequiresApi(28)
    public static final Bitmap decodeBitmap(ImageDecoder.Source source, final X5.o oVar) {
        Bitmap decodeBitmap;
        decodeBitmap = ImageDecoder.decodeBitmap(source, s.a(new ImageDecoder.OnHeaderDecodedListener() { // from class: androidx.core.graphics.ImageDecoderKt$decodeBitmap$1
            @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
            public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source2) {
                X5.o.this.invoke(imageDecoder, imageInfo, source2);
            }
        }));
        return decodeBitmap;
    }

    @RequiresApi(28)
    public static final Drawable decodeDrawable(ImageDecoder.Source source, final X5.o oVar) {
        Drawable decodeDrawable;
        decodeDrawable = ImageDecoder.decodeDrawable(source, s.a(new ImageDecoder.OnHeaderDecodedListener() { // from class: androidx.core.graphics.ImageDecoderKt$decodeDrawable$1
            @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
            public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source2) {
                X5.o.this.invoke(imageDecoder, imageInfo, source2);
            }
        }));
        return decodeDrawable;
    }
}
