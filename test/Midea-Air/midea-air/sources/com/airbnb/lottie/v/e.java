package com.airbnb.lottie.v;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.q.a.j;
import com.airbnb.lottie.s.j.l;
import java.util.List;

/* compiled from: MiscUtils.java */
/* loaded from: classes.dex */
public class e {
    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f2, float f3, float f4) {
        return Math.max(f3, Math.min(f4, f2));
    }

    public static int c(int i2, int i3, int i4) {
        return Math.max(i3, Math.min(i4, i2));
    }

    public static boolean d(float f2, float f3, float f4) {
        return f2 >= f3 && f2 <= f4;
    }

    private static int e(int i2, int i3) {
        int i4 = i2 / i3;
        return (((i2 ^ i3) >= 0) || i2 % i3 == 0) ? i4 : i4 - 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(float f2, float f3) {
        return g((int) f2, (int) f3);
    }

    private static int g(int i2, int i3) {
        return i2 - (i3 * e(i2, i3));
    }

    public static void h(l lVar, Path path) {
        path.reset();
        PointF b2 = lVar.b();
        path.moveTo(b2.x, b2.y);
        PointF pointF = new PointF(b2.x, b2.y);
        for (int i2 = 0; i2 < lVar.a().size(); i2++) {
            com.airbnb.lottie.s.a aVar = lVar.a().get(i2);
            PointF a = aVar.a();
            PointF b3 = aVar.b();
            PointF c2 = aVar.c();
            if (a.equals(pointF) && b3.equals(c2)) {
                path.lineTo(c2.x, c2.y);
            } else {
                path.cubicTo(a.x, a.y, b3.x, b3.y, c2.x, c2.y);
            }
            pointF.set(c2.x, c2.y);
        }
        if (lVar.d()) {
            path.close();
        }
    }

    public static double i(double d2, double d3, double d4) {
        return d2 + (d4 * (d3 - d2));
    }

    public static float j(float f2, float f3, float f4) {
        return f2 + (f4 * (f3 - f2));
    }

    public static int k(int i2, int i3, float f2) {
        return (int) (i2 + (f2 * (i3 - i2)));
    }

    public static void l(com.airbnb.lottie.s.e eVar, int i2, List<com.airbnb.lottie.s.e> list, com.airbnb.lottie.s.e eVar2, j jVar) {
        if (eVar.c(jVar.getName(), i2)) {
            list.add(eVar2.a(jVar.getName()).i(jVar));
        }
    }
}
