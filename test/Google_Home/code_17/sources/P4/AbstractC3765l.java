package p4;

import a6.InterfaceC1668n;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* renamed from: p4.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3765l {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p4.l$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f37604a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f37605b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, String str2) {
            super(1);
            this.f37604a = str;
            this.f37605b = str2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SemanticsPropertyReceiver) obj);
            return O5.I.f8278a;
        }

        public final void invoke(SemanticsPropertyReceiver semantics) {
            AbstractC3255y.i(semantics, "$this$semantics");
            SemanticsPropertiesKt.setTestTag(semantics, this.f37604a);
            SemanticsPropertiesKt.setStateDescription(semantics, this.f37605b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p4.l$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f37606a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f37607b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f37608c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f37609d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f37610e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f37611f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f37612g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f37613h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Modifier modifier, String str, boolean z8, String str2, boolean z9, Function1 function1, int i8, int i9) {
            super(2);
            this.f37606a = modifier;
            this.f37607b = str;
            this.f37608c = z8;
            this.f37609d = str2;
            this.f37610e = z9;
            this.f37611f = function1;
            this.f37612g = i8;
            this.f37613h = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC3765l.a(this.f37606a, this.f37607b, this.f37608c, this.f37609d, this.f37610e, this.f37611f, composer, RecomposeScopeImplKt.updateChangedFlags(this.f37612g | 1), this.f37613h);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.ui.Modifier r28, java.lang.String r29, boolean r30, java.lang.String r31, boolean r32, kotlin.jvm.functions.Function1 r33, androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.AbstractC3765l.a(androidx.compose.ui.Modifier, java.lang.String, boolean, java.lang.String, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }
}
