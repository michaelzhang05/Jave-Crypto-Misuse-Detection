package androidx.compose.runtime;

import L5.I;
import L5.t;
import X5.n;
import X5.o;
import i6.AbstractC2829k;
import i6.M;

@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2", f = "Recomposer.kt", l = {71, 73}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class RecomposerKt$withRunningRecomposer$2 extends kotlin.coroutines.jvm.internal.l implements n {
    final /* synthetic */ o $block;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2$1", f = "Recomposer.kt", l = {70}, m = "invokeSuspend")
    /* renamed from: androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements n {
        final /* synthetic */ Recomposer $recomposer;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Recomposer recomposer, P5.d dVar) {
            super(2, dVar);
            this.$recomposer = recomposer;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new AnonymousClass1(this.$recomposer, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((AnonymousClass1) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.label;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                Recomposer recomposer = this.$recomposer;
                this.label = 1;
                if (recomposer.runRecomposeAndApplyChanges(this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecomposerKt$withRunningRecomposer$2(o oVar, P5.d dVar) {
        super(2, dVar);
        this.$block = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final P5.d create(Object obj, P5.d dVar) {
        RecomposerKt$withRunningRecomposer$2 recomposerKt$withRunningRecomposer$2 = new RecomposerKt$withRunningRecomposer$2(this.$block, dVar);
        recomposerKt$withRunningRecomposer$2.L$0 = obj;
        return recomposerKt$withRunningRecomposer$2;
    }

    @Override // X5.n
    public final Object invoke(M m8, P5.d dVar) {
        return ((RecomposerKt$withRunningRecomposer$2) create(m8, dVar)).invokeSuspend(I.f6487a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Recomposer recomposer;
        Object e8 = Q5.b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 == 2) {
                    Object obj2 = this.L$0;
                    t.b(obj);
                    return obj2;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            recomposer = (Recomposer) this.L$0;
            t.b(obj);
        } else {
            t.b(obj);
            M m8 = (M) this.L$0;
            recomposer = new Recomposer(m8.getCoroutineContext());
            AbstractC2829k.d(m8, null, null, new AnonymousClass1(recomposer, null), 3, null);
            o oVar = this.$block;
            this.L$0 = recomposer;
            this.label = 1;
            obj = oVar.invoke(m8, recomposer, this);
            if (obj == e8) {
                return e8;
            }
        }
        recomposer.close();
        this.L$0 = obj;
        this.label = 2;
        if (recomposer.join(this) == e8) {
            return e8;
        }
        return obj;
    }
}
