package cm.aptoide.pt.comments.view;

import android.view.View;
import android.widget.Button;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.pt.AptoideApplication;
import cm.aptoide.pt.R;
import cm.aptoide.pt.account.AccountAnalytics;
import cm.aptoide.pt.account.view.AccountNavigator;
import cm.aptoide.pt.crashreports.CrashReport;
import cm.aptoide.pt.navigator.ActivityResultNavigator;
import cm.aptoide.pt.store.view.StoreAddCommentDisplayable;
import cm.aptoide.pt.utils.design.ShowMessage;
import cm.aptoide.pt.view.recycler.widget.Widget;

/* loaded from: classes.dex */
public class StoreAddCommentWidget extends Widget<StoreAddCommentDisplayable> {
    private static final String TAG = "cm.aptoide.pt.comments.view.StoreAddCommentWidget";
    private AptoideAccountManager accountManager;
    private AccountNavigator accountNavigator;
    private Button commentStore;

    public StoreAddCommentWidget(View view) {
        super(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$bindView$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e a(StoreAddCommentDisplayable storeAddCommentDisplayable, Void r8) {
        return showStoreCommentFragment(storeAddCommentDisplayable.getStoreId(), storeAddCommentDisplayable.getStoreName(), getContext().getSupportFragmentManager(), this.commentStore);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$bindView$1(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showSignInMessage$7, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void b(View view) {
        this.accountNavigator.navigateToAccountView(AccountAnalytics.AccountOrigins.STORE_COMMENT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showStoreCommentFragment$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e c(long j2, String str, final androidx.fragment.app.h hVar, View view, Boolean bool) {
        if (bool.booleanValue()) {
            final CommentDialogFragment newInstanceStoreComment = CommentDialogFragment.newInstanceStoreComment(j2, str);
            return newInstanceStoreComment.lifecycle().y(new rx.m.a() { // from class: cm.aptoide.pt.comments.view.x0
                @Override // rx.m.a
                public final void call() {
                    CommentDialogFragment.this.show(hVar, "fragment_comment_dialog");
                }
            }).D(new rx.m.e() { // from class: cm.aptoide.pt.comments.view.y0
                @Override // rx.m.e
                public final Object call(Object obj) {
                    Boolean valueOf;
                    valueOf = Boolean.valueOf(((com.trello.rxlifecycle.g.b) obj).equals(com.trello.rxlifecycle.g.b.DESTROY_VIEW));
                    return valueOf;
                }
            }).G(new rx.m.e() { // from class: cm.aptoide.pt.comments.view.e1
                @Override // rx.m.e
                public final Object call(Object obj) {
                    rx.e B;
                    B = rx.e.B();
                    return B;
                }
            });
        }
        return showSignInMessage(view).M();
    }

    private rx.b showSignInMessage(View view) {
        return ShowMessage.asObservableSnack(view, R.string.you_need_to_be_logged_in, R.string.login, new View.OnClickListener() { // from class: cm.aptoide.pt.comments.view.z0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                StoreAddCommentWidget.this.b(view2);
            }
        });
    }

    private rx.e<Void> showStoreCommentFragment(final long j2, final String str, final androidx.fragment.app.h hVar, final View view) {
        return rx.e.S(Boolean.valueOf(this.accountManager.isLoggedIn())).G(new rx.m.e() { // from class: cm.aptoide.pt.comments.view.c1
            @Override // rx.m.e
            public final Object call(Object obj) {
                return StoreAddCommentWidget.this.c(j2, str, hVar, view, (Boolean) obj);
            }
        });
    }

    @Override // cm.aptoide.pt.view.recycler.widget.Widget
    protected void assignViews(View view) {
        this.commentStore = (Button) view.findViewById(R.id.comment_store_button);
    }

    @Override // cm.aptoide.pt.view.recycler.widget.Widget
    public void bindView(final StoreAddCommentDisplayable storeAddCommentDisplayable, int i2) {
        this.accountManager = ((AptoideApplication) getContext().getApplicationContext()).getAccountManager();
        this.accountNavigator = ((ActivityResultNavigator) getContext()).getAccountNavigator();
        this.commentStore.setBackgroundResource(storeAddCommentDisplayable.getRaisedButtonDrawable());
        this.compositeSubscription.a(e.g.a.c.a.a(this.commentStore).G(new rx.m.e() { // from class: cm.aptoide.pt.comments.view.a1
            @Override // rx.m.e
            public final Object call(Object obj) {
                return StoreAddCommentWidget.this.a(storeAddCommentDisplayable, (Void) obj);
            }
        }).H0(new rx.m.b() { // from class: cm.aptoide.pt.comments.view.d1
            @Override // rx.m.b
            public final void call(Object obj) {
                StoreAddCommentWidget.lambda$bindView$1((Void) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.comments.view.b1
            @Override // rx.m.b
            public final void call(Object obj) {
                CrashReport.getInstance().log((Throwable) obj);
            }
        }));
    }
}
