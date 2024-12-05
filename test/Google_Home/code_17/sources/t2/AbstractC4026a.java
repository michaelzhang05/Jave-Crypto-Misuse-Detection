package t2;

import O5.I;
import O5.t;
import a6.InterfaceC1668n;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3256z;
import l6.M;
import q4.C3847d;
import q4.C3850g;
import r.AbstractC3885b;
import r.InterfaceC3886c;

/* renamed from: t2.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4026a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0883a extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f39566a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3850g f39567b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0883a(C3850g c3850g, S5.d dVar) {
            super(2, dVar);
            this.f39567b = c3850g;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new C0883a(this.f39567b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f39566a == 0) {
                t.b(obj);
                this.f39567b.d(AbstractC4026a.d());
                return I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((C0883a) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t2.a$b */
    /* loaded from: classes4.dex */
    public static final class b extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f39568a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3886c f39569b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3847d f39570c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ State f39571d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC3886c interfaceC3886c, C3847d c3847d, State state, S5.d dVar) {
            super(2, dVar);
            this.f39569b = interfaceC3886c;
            this.f39570c = c3847d;
            this.f39571d = state;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new b(this.f39569b, this.f39570c, this.f39571d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f39568a == 0) {
                t.b(obj);
                AbstractC3885b.b(this.f39569b, Color.m2975copywmQWz5c$default(this.f39570c.a(), AbstractC4026a.b(this.f39571d), 0.0f, 0.0f, 0.0f, 14, null), false, null, 4, null);
                return I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t2.a$c */
    /* loaded from: classes4.dex */
    public static final class c extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f39572a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3886c f39573b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC3886c interfaceC3886c, S5.d dVar) {
            super(2, dVar);
            this.f39573b = interfaceC3886c;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new c(this.f39573b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f39572a == 0) {
                t.b(obj);
                AbstractC3885b.a(this.f39573b, Color.Companion.m3011getTransparent0d7_KjU(), false, false, null, 12, null);
                return I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t2.a$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3850g f39574a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f39575b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f39576c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC1668n f39577d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f39578e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f39579f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C3850g c3850g, Modifier modifier, Function0 function0, InterfaceC1668n interfaceC1668n, int i8, int i9) {
            super(2);
            this.f39574a = c3850g;
            this.f39575b = modifier;
            this.f39576c = function0;
            this.f39577d = interfaceC1668n;
            this.f39578e = i8;
            this.f39579f = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC4026a.a(this.f39574a, this.f39575b, this.f39576c, this.f39577d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f39578e | 1), this.f39579f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(q4.C3850g r21, androidx.compose.ui.Modifier r22, kotlin.jvm.functions.Function0 r23, a6.InterfaceC1668n r24, androidx.compose.runtime.Composer r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.AbstractC4026a.a(q4.g, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, a6.n, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float b(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    public static final /* synthetic */ boolean d() {
        return e();
    }

    private static final boolean e() {
        return false;
    }
}
