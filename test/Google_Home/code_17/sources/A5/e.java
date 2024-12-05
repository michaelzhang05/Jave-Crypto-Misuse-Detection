package A5;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;

/* loaded from: classes5.dex */
public class e implements a {

    /* renamed from: b, reason: collision with root package name */
    private final RenderScript f490b;

    /* renamed from: c, reason: collision with root package name */
    private final ScriptIntrinsicBlur f491c;

    /* renamed from: d, reason: collision with root package name */
    private Allocation f492d;

    /* renamed from: a, reason: collision with root package name */
    private final Paint f489a = new Paint(2);

    /* renamed from: e, reason: collision with root package name */
    private int f493e = -1;

    /* renamed from: f, reason: collision with root package name */
    private int f494f = -1;

    public e(Context context) {
        RenderScript create = RenderScript.create(context);
        this.f490b = create;
        this.f491c = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
    }

    private boolean f(Bitmap bitmap) {
        if (bitmap.getHeight() == this.f494f && bitmap.getWidth() == this.f493e) {
            return true;
        }
        return false;
    }

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
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f489a);
    }

    @Override // A5.a
    public final void destroy() {
        this.f491c.destroy();
        this.f490b.destroy();
        Allocation allocation = this.f492d;
        if (allocation != null) {
            allocation.destroy();
        }
    }

    @Override // A5.a
    public Bitmap e(Bitmap bitmap, float f8) {
        Allocation createFromBitmap = Allocation.createFromBitmap(this.f490b, bitmap);
        if (!f(bitmap)) {
            Allocation allocation = this.f492d;
            if (allocation != null) {
                allocation.destroy();
            }
            this.f492d = Allocation.createTyped(this.f490b, createFromBitmap.getType());
            this.f493e = bitmap.getWidth();
            this.f494f = bitmap.getHeight();
        }
        this.f491c.setRadius(f8);
        this.f491c.setInput(createFromBitmap);
        this.f491c.forEach(this.f492d);
        this.f492d.copyTo(bitmap);
        createFromBitmap.destroy();
        return bitmap;
    }
}
