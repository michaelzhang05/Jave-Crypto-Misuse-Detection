package q4;

import O5.I;
import O5.t;
import a6.InterfaceC1668n;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.text.input.TextInputService;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import o6.AbstractC3708h;

/* renamed from: q4.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3845b {

    /* renamed from: c, reason: collision with root package name */
    public static final int f38266c = TextInputService.$stable;

    /* renamed from: a, reason: collision with root package name */
    private final TextInputService f38267a;

    /* renamed from: b, reason: collision with root package name */
    private final State f38268b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q4.b$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return (Boolean) C3845b.this.f38268b.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q4.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0863b extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f38270a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ boolean f38271b;

        C0863b(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            C0863b c0863b = new C0863b(dVar);
            c0863b.f38271b = ((Boolean) obj).booleanValue();
            return c0863b;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (S5.d) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f38270a == 0) {
                t.b(obj);
                return kotlin.coroutines.jvm.internal.b.a(!this.f38271b);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(boolean z8, S5.d dVar) {
            return ((C0863b) create(Boolean.valueOf(z8), dVar)).invokeSuspend(I.f8278a);
        }
    }

    public C3845b(TextInputService textInputService, State isKeyboardVisible) {
        AbstractC3255y.i(isKeyboardVisible, "isKeyboardVisible");
        this.f38267a = textInputService;
        this.f38268b = isKeyboardVisible;
    }

    private final Object b(S5.d dVar) {
        Object x8 = AbstractC3708h.x(SnapshotStateKt.snapshotFlow(new a()), new C0863b(null), dVar);
        if (x8 == T5.b.e()) {
            return x8;
        }
        return I.f8278a;
    }

    public final Object c(S5.d dVar) {
        if (((Boolean) this.f38268b.getValue()).booleanValue()) {
            TextInputService textInputService = this.f38267a;
            if (textInputService != null) {
                textInputService.hideSoftwareKeyboard();
            }
            Object b8 = b(dVar);
            if (b8 == T5.b.e()) {
                return b8;
            }
            return I.f8278a;
        }
        return I.f8278a;
    }
}
