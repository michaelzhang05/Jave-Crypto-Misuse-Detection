package n5;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import androidx.core.content.ContextCompat;
import com.uptodown.R;
import i2.InterfaceC2777e;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: n5.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3476d implements InterfaceC2777e {

    /* renamed from: a, reason: collision with root package name */
    private final Context f36200a;

    public C3476d(Context context) {
        AbstractC3159y.i(context, "context");
        this.f36200a = context;
    }

    @Override // i2.InterfaceC2777e
    public Bitmap a(Bitmap source) {
        AbstractC3159y.i(source, "source");
        int width = source.getWidth();
        int height = source.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, source.getConfig());
        AbstractC3159y.h(createBitmap, "createBitmap(width, height, source.config)");
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(source, 0.0f, 0.0f, (Paint) null);
        float f8 = height - (height / 3);
        float f9 = height;
        LinearGradient linearGradient = new LinearGradient(0.0f, f8, 0.0f, f9, 0, ContextCompat.getColor(this.f36200a, R.color.background_color), Shader.TileMode.CLAMP);
        Paint paint = new Paint();
        paint.setShader(linearGradient);
        canvas.drawRect(0.0f, f8, width, f9, paint);
        source.recycle();
        return createBitmap;
    }

    @Override // i2.InterfaceC2777e
    public String key() {
        return "bottomGradient";
    }
}
