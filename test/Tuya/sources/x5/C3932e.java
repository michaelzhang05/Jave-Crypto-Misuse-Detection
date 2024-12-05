package x5;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;

/* renamed from: x5.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3932e implements InterfaceC3928a {

    /* renamed from: b, reason: collision with root package name */
    private final RenderScript f39495b;

    /* renamed from: c, reason: collision with root package name */
    private final ScriptIntrinsicBlur f39496c;

    /* renamed from: d, reason: collision with root package name */
    private Allocation f39497d;

    /* renamed from: a, reason: collision with root package name */
    private final Paint f39494a = new Paint(2);

    /* renamed from: e, reason: collision with root package name */
    private int f39498e = -1;

    /* renamed from: f, reason: collision with root package name */
    private int f39499f = -1;

    public C3932e(Context context) {
        RenderScript create = RenderScript.create(context);
        this.f39495b = create;
        this.f39496c = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
    }

    private boolean f(Bitmap bitmap) {
        if (bitmap.getHeight() == this.f39499f && bitmap.getWidth() == this.f39498e) {
            return true;
        }
        return false;
    }

    @Override // x5.InterfaceC3928a
    public float a() {
        return 6.0f;
    }

    @Override // x5.InterfaceC3928a
    public Bitmap.Config b() {
        return Bitmap.Config.ARGB_8888;
    }

    @Override // x5.InterfaceC3928a
    public boolean c() {
        return true;
    }

    @Override // x5.InterfaceC3928a
    public void d(Canvas canvas, Bitmap bitmap) {
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f39494a);
    }

    @Override // x5.InterfaceC3928a
    public final void destroy() {
        this.f39496c.destroy();
        this.f39495b.destroy();
        Allocation allocation = this.f39497d;
        if (allocation != null) {
            allocation.destroy();
        }
    }

    @Override // x5.InterfaceC3928a
    public Bitmap e(Bitmap bitmap, float f8) {
        Allocation createFromBitmap = Allocation.createFromBitmap(this.f39495b, bitmap);
        if (!f(bitmap)) {
            Allocation allocation = this.f39497d;
            if (allocation != null) {
                allocation.destroy();
            }
            this.f39497d = Allocation.createTyped(this.f39495b, createFromBitmap.getType());
            this.f39498e = bitmap.getWidth();
            this.f39499f = bitmap.getHeight();
        }
        this.f39496c.setRadius(f8);
        this.f39496c.setInput(createFromBitmap);
        this.f39496c.forEach(this.f39497d);
        this.f39497d.copyTo(bitmap);
        createFromBitmap.destroy();
        return bitmap;
    }
}
