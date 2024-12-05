package o3;

import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetLauncher;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: o3.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3528b implements c {

    /* renamed from: b, reason: collision with root package name */
    private final FinancialConnectionsSheetLauncher f36377b;

    public C3528b(FinancialConnectionsSheetLauncher launcher) {
        AbstractC3159y.i(launcher, "launcher");
        this.f36377b = launcher;
    }

    @Override // o3.c
    public void a(String financialConnectionsSessionClientSecret, String publishableKey, String str) {
        AbstractC3159y.i(financialConnectionsSessionClientSecret, "financialConnectionsSessionClientSecret");
        AbstractC3159y.i(publishableKey, "publishableKey");
        this.f36377b.present(new FinancialConnectionsSheet.Configuration(financialConnectionsSessionClientSecret, publishableKey, str));
    }
}
