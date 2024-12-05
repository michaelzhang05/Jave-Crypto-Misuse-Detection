package N3;

import O5.I;
import a6.InterfaceC1668n;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import h6.i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.U;

/* loaded from: classes4.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ i[] f7726a = {U.e(new E(e.class, "testMetadata", "getTestMetadata(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1))};

    /* renamed from: b, reason: collision with root package name */
    private static final SemanticsPropertyKey f7727b = new SemanticsPropertyKey("TestMetadata", a.f7728a);

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f7728a = new a();

        a() {
            super(2);
        }

        @Override // a6.InterfaceC1668n
        public final String invoke(String str, String str2) {
            return str;
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f7729a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f7729a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SemanticsPropertyReceiver) obj);
            return I.f8278a;
        }

        public final void invoke(SemanticsPropertyReceiver semantics) {
            AbstractC3255y.i(semantics, "$this$semantics");
            e.a(semantics, this.f7729a);
        }
    }

    public static final void a(SemanticsPropertyReceiver semanticsPropertyReceiver, String str) {
        AbstractC3255y.i(semanticsPropertyReceiver, "<this>");
        f7727b.setValue(semanticsPropertyReceiver, f7726a[0], str);
    }

    public static final Modifier b(Modifier modifier, String str) {
        AbstractC3255y.i(modifier, "<this>");
        return SemanticsModifierKt.semantics$default(modifier, false, new b(str), 1, null);
    }
}
