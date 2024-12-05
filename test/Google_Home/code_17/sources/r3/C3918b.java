package r3;

import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetLauncher;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: r3.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3918b implements c {

    /* renamed from: b, reason: collision with root package name */
    private final FinancialConnectionsSheetLauncher f38585b;

    public C3918b(FinancialConnectionsSheetLauncher launcher) {
        AbstractC3255y.i(launcher, "launcher");
        this.f38585b = launcher;
    }

    @Override // r3.c
    public void a(String financialConnectionsSessionClientSecret, String publishableKey, String str) {
        AbstractC3255y.i(financialConnectionsSessionClientSecret, "financialConnectionsSessionClientSecret");
        AbstractC3255y.i(publishableKey, "publishableKey");
        this.f38585b.present(new FinancialConnectionsSheet.Configuration(financialConnectionsSessionClientSecret, publishableKey, str));
    }
}
