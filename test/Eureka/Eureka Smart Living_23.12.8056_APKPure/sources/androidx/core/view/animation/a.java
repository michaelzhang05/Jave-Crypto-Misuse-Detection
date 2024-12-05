package androidx.core.view.animation;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: androidx.core.view.animation.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0036a {
        static PathInterpolator a(float f6, float f7) {
            return new PathInterpolator(f6, f7);
        }

        static PathInterpolator b(float f6, float f7, float f8, float f9) {
            return new PathInterpolator(f6, f7, f8, f9);
        }

        static PathInterpolator c(Path path) {
            return new PathInterpolator(path);
        }
    }

    public static Interpolator a(float f6, float f7, float f8, float f9) {
        return C0036a.b(f6, f7, f8, f9);
    }

    public static Interpolator b(Path path) {
        return C0036a.c(path);
    }
}
