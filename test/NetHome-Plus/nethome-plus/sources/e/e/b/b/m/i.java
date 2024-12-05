package e.e.b.b.m;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* compiled from: MotionTiming.java */
/* loaded from: classes2.dex */
public class i {
    private long a;

    /* renamed from: b, reason: collision with root package name */
    private long f17514b;

    /* renamed from: c, reason: collision with root package name */
    private TimeInterpolator f17515c;

    /* renamed from: d, reason: collision with root package name */
    private int f17516d;

    /* renamed from: e, reason: collision with root package name */
    private int f17517e;

    public i(long j2, long j3) {
        this.a = 0L;
        this.f17514b = 300L;
        this.f17515c = null;
        this.f17516d = 0;
        this.f17517e = 1;
        this.a = j2;
        this.f17514b = j3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i b(ValueAnimator valueAnimator) {
        i iVar = new i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), f(valueAnimator));
        iVar.f17516d = valueAnimator.getRepeatCount();
        iVar.f17517e = valueAnimator.getRepeatMode();
        return iVar;
    }

    private static TimeInterpolator f(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if (!(interpolator instanceof AccelerateDecelerateInterpolator) && interpolator != null) {
            if (interpolator instanceof AccelerateInterpolator) {
                return a.f17507c;
            }
            return interpolator instanceof DecelerateInterpolator ? a.f17508d : interpolator;
        }
        return a.f17506b;
    }

    public void a(Animator animator) {
        animator.setStartDelay(c());
        animator.setDuration(d());
        animator.setInterpolator(e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(g());
            valueAnimator.setRepeatMode(h());
        }
    }

    public long c() {
        return this.a;
    }

    public long d() {
        return this.f17514b;
    }

    public TimeInterpolator e() {
        TimeInterpolator timeInterpolator = this.f17515c;
        return timeInterpolator != null ? timeInterpolator : a.f17506b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (c() == iVar.c() && d() == iVar.d() && g() == iVar.g() && h() == iVar.h()) {
            return e().getClass().equals(iVar.e().getClass());
        }
        return false;
    }

    public int g() {
        return this.f17516d;
    }

    public int h() {
        return this.f17517e;
    }

    public int hashCode() {
        return (((((((((int) (c() ^ (c() >>> 32))) * 31) + ((int) (d() ^ (d() >>> 32)))) * 31) + e().getClass().hashCode()) * 31) + g()) * 31) + h();
    }

    public String toString() {
        return '\n' + i.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + c() + " duration: " + d() + " interpolator: " + e().getClass() + " repeatCount: " + g() + " repeatMode: " + h() + "}\n";
    }

    public i(long j2, long j3, TimeInterpolator timeInterpolator) {
        this.a = 0L;
        this.f17514b = 300L;
        this.f17515c = null;
        this.f17516d = 0;
        this.f17517e = 1;
        this.a = j2;
        this.f17514b = j3;
        this.f17515c = timeInterpolator;
    }
}
