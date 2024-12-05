package c3;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    private final c f4022a;

    /* renamed from: b, reason: collision with root package name */
    private final float f4023b;

    public b(float f6, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f4022a;
            f6 += ((b) cVar).f4023b;
        }
        this.f4022a = cVar;
        this.f4023b = f6;
    }

    @Override // c3.c
    public float a(RectF rectF) {
        return Math.max(0.0f, this.f4022a.a(rectF) + this.f4023b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f4022a.equals(bVar.f4022a) && this.f4023b == bVar.f4023b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4022a, Float.valueOf(this.f4023b)});
    }
}
