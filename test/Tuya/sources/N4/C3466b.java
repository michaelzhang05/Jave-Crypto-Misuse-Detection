package n4;

import L5.I;
import L5.t;
import X5.n;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.text.input.TextInputService;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.AbstractC3360h;

/* renamed from: n4.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3466b {

    /* renamed from: c, reason: collision with root package name */
    public static final int f36138c = TextInputService.$stable;

    /* renamed from: a, reason: collision with root package name */
    private final TextInputService f36139a;

    /* renamed from: b, reason: collision with root package name */
    private final State f36140b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n4.b$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return (Boolean) C3466b.this.f36140b.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n4.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0833b extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f36142a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ boolean f36143b;

        C0833b(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            C0833b c0833b = new C0833b(dVar);
            c0833b.f36143b = ((Boolean) obj).booleanValue();
            return c0833b;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (P5.d) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f36142a == 0) {
                t.b(obj);
                return kotlin.coroutines.jvm.internal.b.a(!this.f36143b);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(boolean z8, P5.d dVar) {
            return ((C0833b) create(Boolean.valueOf(z8), dVar)).invokeSuspend(I.f6487a);
        }
    }

    public C3466b(TextInputService textInputService, State isKeyboardVisible) {
        AbstractC3159y.i(isKeyboardVisible, "isKeyboardVisible");
        this.f36139a = textInputService;
        this.f36140b = isKeyboardVisible;
    }

    private final Object b(P5.d dVar) {
        Object v8 = AbstractC3360h.v(SnapshotStateKt.snapshotFlow(new a()), new C0833b(null), dVar);
        if (v8 == Q5.b.e()) {
            return v8;
        }
        return I.f6487a;
    }

    public final Object c(P5.d dVar) {
        if (((Boolean) this.f36140b.getValue()).booleanValue()) {
            TextInputService textInputService = this.f36139a;
            if (textInputService != null) {
                textInputService.hideSoftwareKeyboard();
            }
            Object b8 = b(dVar);
            if (b8 == Q5.b.e()) {
                return b8;
            }
            return I.f6487a;
        }
        return I.f6487a;
    }
}
