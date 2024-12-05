package o5;

import a5.I;
import a5.Q;
import android.accounts.AbstractAccountAuthenticator;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.accounts.AccountManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.uptodown.activities.LoginActivity;
import com.uptodown.activities.preferences.SettingsPreferences;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONObject;

/* renamed from: o5.m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3673m extends AbstractAccountAuthenticator {

    /* renamed from: a, reason: collision with root package name */
    private final Context f36504a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3673m(Context mContext) {
        super(mContext);
        AbstractC3255y.i(mContext, "mContext");
        this.f36504a = mContext;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle addAccount(AccountAuthenticatorResponse accountAuthenticatorResponse, String str, String str2, String[] strArr, Bundle bundle) {
        Intent intent = new Intent(this.f36504a, (Class<?>) LoginActivity.class);
        intent.putExtra("accountAuthenticatorResponse", accountAuthenticatorResponse);
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("intent", intent);
        return bundle2;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle confirmCredentials(AccountAuthenticatorResponse response, Account account, Bundle options) {
        AbstractC3255y.i(response, "response");
        AbstractC3255y.i(account, "account");
        AbstractC3255y.i(options, "options");
        return null;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle editProperties(AccountAuthenticatorResponse response, String accountType) {
        AbstractC3255y.i(response, "response");
        AbstractC3255y.i(accountType, "accountType");
        return null;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle getAccountRemovalAllowed(AccountAuthenticatorResponse response, Account account) {
        AbstractC3255y.i(response, "response");
        AbstractC3255y.i(account, "account");
        Bundle result = super.getAccountRemovalAllowed(response, account);
        if (result != null && result.containsKey("booleanResult") && !result.containsKey("intent") && result.getBoolean("booleanResult")) {
            Q.f14058k.b(this.f36504a);
        }
        AbstractC3255y.h(result, "result");
        return result;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle getAuthToken(AccountAuthenticatorResponse response, Account account, String authTokenType, Bundle options) {
        String password;
        AbstractC3255y.i(response, "response");
        AbstractC3255y.i(account, "account");
        AbstractC3255y.i(authTokenType, "authTokenType");
        AbstractC3255y.i(options, "options");
        AccountManager accountManager = AccountManager.get(this.f36504a);
        String peekAuthToken = accountManager.peekAuthToken(account, authTokenType);
        if (TextUtils.isEmpty(peekAuthToken) && (password = accountManager.getPassword(account)) != null) {
            String name = account.name;
            C3660F c3660f = new C3660F(this.f36504a);
            AbstractC3255y.h(name, "name");
            I A02 = c3660f.A0(name, password);
            try {
                if (A02.d() != null) {
                    String d8 = A02.d();
                    AbstractC3255y.f(d8);
                    if (d8.length() > 0) {
                        String d9 = A02.d();
                        AbstractC3255y.f(d9);
                        JSONObject jSONObject = new JSONObject(d9);
                        if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                            JSONObject jSONObject2 = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                            AbstractC3255y.h(jSONObject2, "jsonObject.getJSONObject(Constantes.FIELD_DATA)");
                            Q q8 = new Q();
                            q8.l(this.f36504a, jSONObject2);
                            if (q8.getId() != null) {
                                String id = q8.getId();
                                AbstractC3255y.f(id);
                                if (id.length() > 0) {
                                    q8.H(this.f36504a);
                                }
                            }
                            String J8 = SettingsPreferences.f30353b.J(this.f36504a);
                            if (J8 == null || J8.length() == 0) {
                                Q.f14058k.b(this.f36504a);
                            }
                        }
                    }
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
        if (!TextUtils.isEmpty(peekAuthToken)) {
            Bundle bundle = new Bundle();
            bundle.putString("authAccount", account.name);
            bundle.putString("accountType", account.type);
            bundle.putString("authtoken", peekAuthToken);
            return bundle;
        }
        Intent intent = new Intent(this.f36504a, (Class<?>) LoginActivity.class);
        intent.putExtra("accountAuthenticatorResponse", response);
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("intent", intent);
        return bundle2;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public String getAuthTokenLabel(String authTokenType) {
        AbstractC3255y.i(authTokenType, "authTokenType");
        return "Uptodown login";
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle hasFeatures(AccountAuthenticatorResponse response, Account account, String[] features) {
        AbstractC3255y.i(response, "response");
        AbstractC3255y.i(account, "account");
        AbstractC3255y.i(features, "features");
        return null;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle updateCredentials(AccountAuthenticatorResponse response, Account account, String authTokenType, Bundle options) {
        AbstractC3255y.i(response, "response");
        AbstractC3255y.i(account, "account");
        AbstractC3255y.i(authTokenType, "authTokenType");
        AbstractC3255y.i(options, "options");
        return null;
    }
}
