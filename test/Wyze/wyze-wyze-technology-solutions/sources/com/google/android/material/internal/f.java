package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;

/* compiled from: StateListAnimator.java */
/* loaded from: classes2.dex */
public final class f {
    private final ArrayList<b> a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private b f16679b = null;

    /* renamed from: c, reason: collision with root package name */
    ValueAnimator f16680c = null;

    /* renamed from: d, reason: collision with root package name */
    private final Animator.AnimatorListener f16681d = new a();

    /* compiled from: StateListAnimator.java */
    /* loaded from: classes2.dex */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f fVar = f.this;
            if (fVar.f16680c == animator) {
                fVar.f16680c = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StateListAnimator.java */
    /* loaded from: classes2.dex */
    public static class b {
        final int[] a;

        /* renamed from: b, reason: collision with root package name */
        final ValueAnimator f16682b;

        b(int[] iArr, ValueAnimator valueAnimator) {
            this.a = iArr;
            this.f16682b = valueAnimator;
        }
    }

    private void b() {
        ValueAnimator valueAnimator = this.f16680c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f16680c = null;
        }
    }

    private void e(b bVar) {
        ValueAnimator valueAnimator = bVar.f16682b;
        this.f16680c = valueAnimator;
        valueAnimator.start();
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f16681d);
        this.a.add(bVar);
    }

    public void c() {
        ValueAnimator valueAnimator = this.f16680c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f16680c = null;
        }
    }

    public void d(int[] iArr) {
        b bVar;
        int size = this.a.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                bVar = null;
                break;
            }
            bVar = this.a.get(i2);
            if (StateSet.stateSetMatches(bVar.a, iArr)) {
                break;
            } else {
                i2++;
            }
        }
        b bVar2 = this.f16679b;
        if (bVar == bVar2) {
            return;
        }
        if (bVar2 != null) {
            b();
        }
        this.f16679b = bVar;
        if (bVar != null) {
            e(bVar);
        }
    }
}
