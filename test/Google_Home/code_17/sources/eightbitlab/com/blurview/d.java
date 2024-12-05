package eightbitlab.com.blurview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import androidx.compose.ui.platform.J0;

/* loaded from: classes5.dex */
public class d implements A5.a {

    /* renamed from: b, reason: collision with root package name */
    private int f31841b;

    /* renamed from: c, reason: collision with root package name */
    private int f31842c;

    /* renamed from: e, reason: collision with root package name */
    public A5.a f31844e;

    /* renamed from: f, reason: collision with root package name */
    private Context f31845f;

    /* renamed from: a, reason: collision with root package name */
    private final RenderNode f31840a = J0.a("BlurViewNode");

    /* renamed from: d, reason: collision with root package name */
    private float f31843d = 1.0f;

    @Override // A5.a
    public float a() {
        return 6.0f;
    }

    @Override // A5.a
    public Bitmap.Config b() {
        return Bitmap.Config.ARGB_8888;
    }

    @Override // A5.a
    public boolean c() {
        return true;
    }

    @Override // A5.a
    public void d(Canvas canvas, Bitmap bitmap) {
        if (canvas.isHardwareAccelerated()) {
            canvas.drawRenderNode(this.f31840a);
            return;
        }
        if (this.f31844e == null) {
            this.f31844e = new A5.e(this.f31845f);
        }
        this.f31844e.e(bitmap, this.f31843d);
        this.f31844e.d(canvas, bitmap);
    }

    @Override // A5.a
    public void destroy() {
        this.f31840a.discardDisplayList();
        A5.a aVar = this.f31844e;
        if (aVar != null) {
            aVar.destroy();
        }
    }

    @Override // A5.a
    public Bitmap e(Bitmap bitmap, float f8) {
        RecordingCanvas beginRecording;
        RenderEffect createBlurEffect;
        this.f31843d = f8;
        if (bitmap.getHeight() != this.f31841b || bitmap.getWidth() != this.f31842c) {
            this.f31841b = bitmap.getHeight();
            int width = bitmap.getWidth();
            this.f31842c = width;
            this.f31840a.setPosition(0, 0, width, this.f31841b);
        }
        beginRecording = this.f31840a.beginRecording();
        beginRecording.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        this.f31840a.endRecording();
        RenderNode renderNode = this.f31840a;
        createBlurEffect = RenderEffect.createBlurEffect(f8, f8, Shader.TileMode.MIRROR);
        renderNode.setRenderEffect(createBlurEffect);
        return bitmap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(Context context) {
        this.f31845f = context;
    }
}
