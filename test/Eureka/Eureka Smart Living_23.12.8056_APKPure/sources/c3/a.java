package c3;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    private final float f4021a;

    public a(float f6) {
        this.f4021a = f6;
    }

    @Override // c3.c
    public float a(RectF rectF) {
        return this.f4021a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f4021a == ((a) obj).f4021a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f4021a)});
    }
}
