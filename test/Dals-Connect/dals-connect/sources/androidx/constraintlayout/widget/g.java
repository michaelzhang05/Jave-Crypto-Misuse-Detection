package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import c.f.b.k.e;

/* compiled from: Placeholder.java */
/* loaded from: classes.dex */
public class g extends View {

    /* renamed from: f, reason: collision with root package name */
    private int f765f;

    /* renamed from: g, reason: collision with root package name */
    private View f766g;

    /* renamed from: h, reason: collision with root package name */
    private int f767h;

    public void a(ConstraintLayout constraintLayout) {
        if (this.f766g == null) {
            return;
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) this.f766g.getLayoutParams();
        bVar2.n0.T0(0);
        e.b y = bVar.n0.y();
        e.b bVar3 = e.b.FIXED;
        if (y != bVar3) {
            bVar.n0.U0(bVar2.n0.R());
        }
        if (bVar.n0.O() != bVar3) {
            bVar.n0.v0(bVar2.n0.v());
        }
        bVar2.n0.T0(8);
    }

    public void b(ConstraintLayout constraintLayout) {
        if (this.f765f == -1 && !isInEditMode()) {
            setVisibility(this.f767h);
        }
        View findViewById = constraintLayout.findViewById(this.f765f);
        this.f766g = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.b) findViewById.getLayoutParams()).b0 = true;
            this.f766g.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f766g;
    }

    public int getEmptyVisibility() {
        return this.f767h;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((width / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((height / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i2) {
        View findViewById;
        if (this.f765f == i2) {
            return;
        }
        View view = this.f766g;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.b) this.f766g.getLayoutParams()).b0 = false;
            this.f766g = null;
        }
        this.f765f = i2;
        if (i2 == -1 || (findViewById = ((View) getParent()).findViewById(i2)) == null) {
            return;
        }
        findViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i2) {
        this.f767h = i2;
    }
}
