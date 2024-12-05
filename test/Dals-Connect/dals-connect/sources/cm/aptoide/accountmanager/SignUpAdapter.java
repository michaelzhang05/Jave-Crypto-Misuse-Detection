package cm.aptoide.accountmanager;

import rx.Single;

/* loaded from: classes.dex */
public interface SignUpAdapter<T> {
    boolean isEnabled();

    rx.b logout();

    Single<Account> signUp(T t, AccountService accountService);
}
