package n2;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private long f7968a;

    /* renamed from: b, reason: collision with root package name */
    private long f7969b;

    /* renamed from: c, reason: collision with root package name */
    private TimeInterpolator f7970c;

    /* renamed from: d, reason: collision with root package name */
    private int f7971d;

    /* renamed from: e, reason: collision with root package name */
    private int f7972e;

    public d(long j6, long j7) {
        this.f7970c = null;
        this.f7971d = 0;
        this.f7972e = 1;
        this.f7968a = j6;
        this.f7969b = j7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d a(ValueAnimator valueAnimator) {
        d dVar = new d(valueAnimator.getStartDelay(), valueAnimator.getDuration(), e(valueAnimator));
        dVar.f7971d = valueAnimator.getRepeatCount();
        dVar.f7972e = valueAnimator.getRepeatMode();
        return dVar;
    }

    private static TimeInterpolator e(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        return ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) ? a.f7962b : interpolator instanceof AccelerateInterpolator ? a.f7963c : interpolator instanceof DecelerateInterpolator ? a.f7964d : interpolator;
    }

    public long b() {
        return this.f7968a;
    }

    public long c() {
        return this.f7969b;
    }

    public TimeInterpolator d() {
        TimeInterpolator timeInterpolator = this.f7970c;
        return timeInterpolator != null ? timeInterpolator : a.f7962b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (b() == dVar.b() && c() == dVar.c() && f() == dVar.f() && g() == dVar.g()) {
            return d().getClass().equals(dVar.d().getClass());
        }
        return false;
    }

    public int f() {
        return this.f7971d;
    }

    public int g() {
        return this.f7972e;
    }

    public int hashCode() {
        return (((((((((int) (b() ^ (b() >>> 32))) * 31) + ((int) (c() ^ (c() >>> 32)))) * 31) + d().getClass().hashCode()) * 31) + f()) * 31) + g();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + b() + " duration: " + c() + " interpolator: " + d().getClass() + " repeatCount: " + f() + " repeatMode: " + g() + "}\n";
    }

    public d(long j6, long j7, TimeInterpolator timeInterpolator) {
        this.f7971d = 0;
        this.f7972e = 1;
        this.f7968a = j6;
        this.f7969b = j7;
        this.f7970c = timeInterpolator;
    }
}
