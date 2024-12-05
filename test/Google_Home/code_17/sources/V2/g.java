package V2;

import O5.I;
import a6.InterfaceC1668n;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import j6.n;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes4.dex */
public abstract class g {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f10658a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f10659b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f10660c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f10661d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f10662e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f10663f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z8, boolean z9, Modifier modifier, int i8, int i9, int i10) {
            super(2);
            this.f10658a = z8;
            this.f10659b = z9;
            this.f10660c = modifier;
            this.f10661d = i8;
            this.f10662e = i9;
            this.f10663f = i10;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            g.a(this.f10658a, this.f10659b, this.f10660c, this.f10661d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f10662e | 1), this.f10663f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(boolean r53, boolean r54, androidx.compose.ui.Modifier r55, int r56, androidx.compose.runtime.Composer r57, int r58, int r59) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: V2.g.a(boolean, boolean, androidx.compose.ui.Modifier, int, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final String b(String str) {
        return n.A(n.A(n.A(n.A(str, "<terms>", "<a href=\"https://link.co/terms\">", false, 4, null), "</terms>", "</a>", false, 4, null), "<privacy>", "<a href=\"https://link.co/privacy\">", false, 4, null), "</privacy>", "</a>", false, 4, null);
    }
}
