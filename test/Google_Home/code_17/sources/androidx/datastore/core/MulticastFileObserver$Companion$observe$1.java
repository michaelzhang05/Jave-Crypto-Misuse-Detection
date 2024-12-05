package androidx.datastore.core;

import O5.I;
import O5.t;
import S5.d;
import T5.b;
import a6.InterfaceC1668n;
import androidx.datastore.core.MulticastFileObserver;
import java.io.File;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.InterfaceC3351d0;
import n6.q;
import n6.s;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.datastore.core.MulticastFileObserver$Companion$observe$1", f = "MulticastFileObserver.android.kt", l = {84, 85}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class MulticastFileObserver$Companion$observe$1 extends l implements InterfaceC1668n {
    final /* synthetic */ File $file;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.datastore.core.MulticastFileObserver$Companion$observe$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends AbstractC3256z implements Function0 {
        final /* synthetic */ InterfaceC3351d0 $disposeListener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(InterfaceC3351d0 interfaceC3351d0) {
            super(0);
            this.$disposeListener = interfaceC3351d0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5451invoke();
            return I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5451invoke() {
            this.$disposeListener.dispose();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MulticastFileObserver$Companion$observe$1(File file, d dVar) {
        super(2, dVar);
        this.$file = file;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        MulticastFileObserver$Companion$observe$1 multicastFileObserver$Companion$observe$1 = new MulticastFileObserver$Companion$observe$1(this.$file, dVar);
        multicastFileObserver$Companion$observe$1.L$0 = obj;
        return multicastFileObserver$Companion$observe$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC3351d0 observe;
        s sVar;
        Object e8 = b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 == 2) {
                    t.b(obj);
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            observe = (InterfaceC3351d0) this.L$1;
            sVar = (s) this.L$0;
            t.b(obj);
        } else {
            t.b(obj);
            s sVar2 = (s) this.L$0;
            MulticastFileObserver$Companion$observe$1$flowObserver$1 multicastFileObserver$Companion$observe$1$flowObserver$1 = new MulticastFileObserver$Companion$observe$1$flowObserver$1(this.$file, sVar2);
            MulticastFileObserver.Companion companion = MulticastFileObserver.Companion;
            File parentFile = this.$file.getParentFile();
            AbstractC3255y.f(parentFile);
            observe = companion.observe(parentFile, multicastFileObserver$Companion$observe$1$flowObserver$1);
            I i9 = I.f8278a;
            this.L$0 = sVar2;
            this.L$1 = observe;
            this.label = 1;
            if (sVar2.d(i9, this) == e8) {
                return e8;
            }
            sVar = sVar2;
        }
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(observe);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        if (q.a(sVar, anonymousClass1, this) == e8) {
            return e8;
        }
        return I.f8278a;
    }

    @Override // a6.InterfaceC1668n
    public final Object invoke(s sVar, d dVar) {
        return ((MulticastFileObserver$Companion$observe$1) create(sVar, dVar)).invokeSuspend(I.f8278a);
    }
}
