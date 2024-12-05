package e.e.b.b.z;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: AdjustedCornerSize.java */
/* loaded from: classes2.dex */
public final class b implements c {
    private final c a;

    /* renamed from: b, reason: collision with root package name */
    private final float f17572b;

    public b(float f2, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).a;
            f2 += ((b) cVar).f17572b;
        }
        this.a = cVar;
        this.f17572b = f2;
    }

    @Override // e.e.b.b.z.c
    public float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.f17572b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a.equals(bVar.a) && this.f17572b == bVar.f17572b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.f17572b)});
    }
}
