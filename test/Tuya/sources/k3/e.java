package K3;

import L5.I;
import X5.n;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import e6.i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.U;

/* loaded from: classes4.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ i[] f5947a = {U.e(new E(e.class, "testMetadata", "getTestMetadata(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1))};

    /* renamed from: b, reason: collision with root package name */
    private static final SemanticsPropertyKey f5948b = new SemanticsPropertyKey("TestMetadata", a.f5949a);

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f5949a = new a();

        a() {
            super(2);
        }

        @Override // X5.n
        public final String invoke(String str, String str2) {
            return str;
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f5950a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f5950a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SemanticsPropertyReceiver) obj);
            return I.f6487a;
        }

        public final void invoke(SemanticsPropertyReceiver semantics) {
            AbstractC3159y.i(semantics, "$this$semantics");
            e.a(semantics, this.f5950a);
        }
    }

    public static final void a(SemanticsPropertyReceiver semanticsPropertyReceiver, String str) {
        AbstractC3159y.i(semanticsPropertyReceiver, "<this>");
        f5948b.setValue(semanticsPropertyReceiver, f5947a[0], str);
    }

    public static final Modifier b(Modifier modifier, String str) {
        AbstractC3159y.i(modifier, "<this>");
        return SemanticsModifierKt.semantics$default(modifier, false, new b(str), 1, null);
    }
}
