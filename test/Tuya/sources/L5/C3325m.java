package l5;

import X4.I;
import X4.Q;
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
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONObject;

/* renamed from: l5.m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3325m extends AbstractAccountAuthenticator {

    /* renamed from: a, reason: collision with root package name */
    private final Context f34503a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3325m(Context mContext) {
        super(mContext);
        AbstractC3159y.i(mContext, "mContext");
        this.f34503a = mContext;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle addAccount(AccountAuthenticatorResponse accountAuthenticatorResponse, String str, String str2, String[] strArr, Bundle bundle) {
        Intent intent = new Intent(this.f34503a, (Class<?>) LoginActivity.class);
        intent.putExtra("accountAuthenticatorResponse", accountAuthenticatorResponse);
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("intent", intent);
        return bundle2;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle confirmCredentials(AccountAuthenticatorResponse response, Account account, Bundle options) {
        AbstractC3159y.i(response, "response");
        AbstractC3159y.i(account, "account");
        AbstractC3159y.i(options, "options");
        return null;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle editProperties(AccountAuthenticatorResponse response, String accountType) {
        AbstractC3159y.i(response, "response");
        AbstractC3159y.i(accountType, "accountType");
        return null;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle getAccountRemovalAllowed(AccountAuthenticatorResponse response, Account account) {
        AbstractC3159y.i(response, "response");
        AbstractC3159y.i(account, "account");
        Bundle result = super.getAccountRemovalAllowed(response, account);
        if (result != null && result.containsKey("booleanResult") && !result.containsKey("intent") && result.getBoolean("booleanResult")) {
            Q.f12437k.b(this.f34503a);
        }
        AbstractC3159y.h(result, "result");
        return result;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle getAuthToken(AccountAuthenticatorResponse response, Account account, String authTokenType, Bundle options) {
        String password;
        AbstractC3159y.i(response, "response");
        AbstractC3159y.i(account, "account");
        AbstractC3159y.i(authTokenType, "authTokenType");
        AbstractC3159y.i(options, "options");
        AccountManager accountManager = AccountManager.get(this.f34503a);
        String peekAuthToken = accountManager.peekAuthToken(account, authTokenType);
        if (TextUtils.isEmpty(peekAuthToken) && (password = accountManager.getPassword(account)) != null) {
            String name = account.name;
            C3312F c3312f = new C3312F(this.f34503a);
            AbstractC3159y.h(name, "name");
            I A02 = c3312f.A0(name, password);
            try {
                if (A02.d() != null) {
                    String d8 = A02.d();
                    AbstractC3159y.f(d8);
                    if (d8.length() > 0) {
                        String d9 = A02.d();
                        AbstractC3159y.f(d9);
                        JSONObject jSONObject = new JSONObject(d9);
                        if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                            JSONObject jSONObject2 = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                            AbstractC3159y.h(jSONObject2, "jsonObject.getJSONObject(Constantes.FIELD_DATA)");
                            Q q8 = new Q();
                            q8.j(this.f34503a, jSONObject2);
                            if (q8.getId() != null) {
                                String id = q8.getId();
                                AbstractC3159y.f(id);
                                if (id.length() > 0) {
                                    q8.L(this.f34503a);
                                }
                            }
                            String J8 = SettingsPreferences.f29323b.J(this.f34503a);
                            if (J8 == null || J8.length() == 0) {
                                Q.f12437k.b(this.f34503a);
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
        Intent intent = new Intent(this.f34503a, (Class<?>) LoginActivity.class);
        intent.putExtra("accountAuthenticatorResponse", response);
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("intent", intent);
        return bundle2;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public String getAuthTokenLabel(String authTokenType) {
        AbstractC3159y.i(authTokenType, "authTokenType");
        return "Uptodown login";
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle hasFeatures(AccountAuthenticatorResponse response, Account account, String[] features) {
        AbstractC3159y.i(response, "response");
        AbstractC3159y.i(account, "account");
        AbstractC3159y.i(features, "features");
        return null;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle updateCredentials(AccountAuthenticatorResponse response, Account account, String authTokenType, Bundle options) {
        AbstractC3159y.i(response, "response");
        AbstractC3159y.i(account, "account");
        AbstractC3159y.i(authTokenType, "authTokenType");
        AbstractC3159y.i(options, "options");
        return null;
    }
}
