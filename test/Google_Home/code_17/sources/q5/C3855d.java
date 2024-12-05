package q5;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import androidx.core.content.ContextCompat;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3255y;
import l2.InterfaceC3312e;

/* renamed from: q5.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3855d implements InterfaceC3312e {

    /* renamed from: a, reason: collision with root package name */
    private final Context f38328a;

    public C3855d(Context context) {
        AbstractC3255y.i(context, "context");
        this.f38328a = context;
    }

    @Override // l2.InterfaceC3312e
    public Bitmap a(Bitmap source) {
        AbstractC3255y.i(source, "source");
        int width = source.getWidth();
        int height = source.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, source.getConfig());
        AbstractC3255y.h(createBitmap, "createBitmap(width, height, source.config)");
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(source, 0.0f, 0.0f, (Paint) null);
        float f8 = height - (height / 3);
        float f9 = height;
        LinearGradient linearGradient = new LinearGradient(0.0f, f8, 0.0f, f9, 0, ContextCompat.getColor(this.f38328a, R.color.background_color), Shader.TileMode.CLAMP);
        Paint paint = new Paint();
        paint.setShader(linearGradient);
        canvas.drawRect(0.0f, f8, width, f9, paint);
        source.recycle();
        return createBitmap;
    }

    @Override // l2.InterfaceC3312e
    public String key() {
        return "bottomGradient";
    }
}
