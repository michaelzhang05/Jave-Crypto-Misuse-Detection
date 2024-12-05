package androidx.compose.material.ripple;

import O5.I;
import O5.t;
import S5.d;
import a6.InterfaceC1668n;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import l6.AbstractC3364k;
import l6.InterfaceC3390x0;
import l6.M;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2", f = "RippleAnimation.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class RippleAnimation$fadeIn$2 extends l implements InterfaceC1668n {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RippleAnimation this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$1", f = "RippleAnimation.kt", l = {89}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material.ripple.RippleAnimation$fadeIn$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends l implements InterfaceC1668n {
        int label;
        final /* synthetic */ RippleAnimation this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(RippleAnimation rippleAnimation, d dVar) {
            super(2, dVar);
            this.this$0 = rippleAnimation;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new AnonymousClass1(this.this$0, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Animatable animatable;
            Object e8 = T5.b.e();
            int i8 = this.label;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                animatable = this.this$0.animatedAlpha;
                Float b8 = kotlin.coroutines.jvm.internal.b.b(1.0f);
                TweenSpec tween$default = AnimationSpecKt.tween$default(75, 0, EasingKt.getLinearEasing(), 2, null);
                this.label = 1;
                if (Animatable.animateTo$default(animatable, b8, tween$default, null, null, this, 12, null) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, d dVar) {
            return ((AnonymousClass1) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$2", f = "RippleAnimation.kt", l = {95}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material.ripple.RippleAnimation$fadeIn$2$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends l implements InterfaceC1668n {
        int label;
        final /* synthetic */ RippleAnimation this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(RippleAnimation rippleAnimation, d dVar) {
            super(2, dVar);
            this.this$0 = rippleAnimation;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new AnonymousClass2(this.this$0, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Animatable animatable;
            Object e8 = T5.b.e();
            int i8 = this.label;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                animatable = this.this$0.animatedRadiusPercent;
                Float b8 = kotlin.coroutines.jvm.internal.b.b(1.0f);
                TweenSpec tween$default = AnimationSpecKt.tween$default(225, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
                this.label = 1;
                if (Animatable.animateTo$default(animatable, b8, tween$default, null, null, this, 12, null) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, d dVar) {
            return ((AnonymousClass2) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$3", f = "RippleAnimation.kt", l = {101}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material.ripple.RippleAnimation$fadeIn$2$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends l implements InterfaceC1668n {
        int label;
        final /* synthetic */ RippleAnimation this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(RippleAnimation rippleAnimation, d dVar) {
            super(2, dVar);
            this.this$0 = rippleAnimation;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new AnonymousClass3(this.this$0, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Animatable animatable;
            Object e8 = T5.b.e();
            int i8 = this.label;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                animatable = this.this$0.animatedCenterPercent;
                Float b8 = kotlin.coroutines.jvm.internal.b.b(1.0f);
                TweenSpec tween$default = AnimationSpecKt.tween$default(225, 0, EasingKt.getLinearEasing(), 2, null);
                this.label = 1;
                if (Animatable.animateTo$default(animatable, b8, tween$default, null, null, this, 12, null) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, d dVar) {
            return ((AnonymousClass3) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RippleAnimation$fadeIn$2(RippleAnimation rippleAnimation, d dVar) {
        super(2, dVar);
        this.this$0 = rippleAnimation;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        RippleAnimation$fadeIn$2 rippleAnimation$fadeIn$2 = new RippleAnimation$fadeIn$2(this.this$0, dVar);
        rippleAnimation$fadeIn$2.L$0 = obj;
        return rippleAnimation$fadeIn$2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC3390x0 d8;
        T5.b.e();
        if (this.label == 0) {
            t.b(obj);
            M m8 = (M) this.L$0;
            AbstractC3364k.d(m8, null, null, new AnonymousClass1(this.this$0, null), 3, null);
            AbstractC3364k.d(m8, null, null, new AnonymousClass2(this.this$0, null), 3, null);
            d8 = AbstractC3364k.d(m8, null, null, new AnonymousClass3(this.this$0, null), 3, null);
            return d8;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // a6.InterfaceC1668n
    public final Object invoke(M m8, d dVar) {
        return ((RippleAnimation$fadeIn$2) create(m8, dVar)).invokeSuspend(I.f8278a);
    }
}
