package cm.aptoide.pt.home;

import android.app.AlertDialog;
import android.content.Context;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import cm.aptoide.analytics.implementation.CrashLogger;
import cm.aptoide.pt.R;
import cm.aptoide.pt.crashreports.CrashReport;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class LoggedInTermsAndConditionsDialog {
    private static final String GDPR_DIALOG_EVENT_LISTENER_IS_NULL = "GDPR_DIALOG_EVENT_LISTENER_IS_NULL";
    private Button continueButton;
    private AlertDialog dialog;
    private Button logoutButton;
    private rx.s.b<String> uiEvents = rx.s.b.g1();
    private CrashLogger crashReport = CrashReport.getInstance();

    public LoggedInTermsAndConditionsDialog(Context context) {
        LayoutInflater from = LayoutInflater.from(context);
        this.dialog = new AlertDialog.Builder(context).create();
        View inflate = from.inflate(R.layout.dialog_logged_in_accept_tos, (ViewGroup) null);
        this.dialog.setView(inflate);
        this.continueButton = (Button) inflate.findViewById(R.id.accept_continue);
        this.logoutButton = (Button) inflate.findViewById(R.id.log_out);
        setPrivacyPolicyLinks(inflate, context, this.uiEvents);
        this.dialog.setCancelable(false);
        this.dialog.setCanceledOnTouchOutside(false);
        this.continueButton.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.home.ea
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoggedInTermsAndConditionsDialog.this.a(view);
            }
        });
        this.logoutButton.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.home.da
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoggedInTermsAndConditionsDialog.this.b(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$new$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void a(View view) {
        rx.s.b<String> bVar = this.uiEvents;
        if (bVar != null) {
            bVar.onNext("continue");
            this.dialog.dismiss();
        } else {
            this.crashReport.log(GDPR_DIALOG_EVENT_LISTENER_IS_NULL, HttpUrl.FRAGMENT_ENCODE_SET);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$new$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void b(View view) {
        rx.s.b<String> bVar = this.uiEvents;
        if (bVar != null) {
            bVar.onNext("logout");
        } else {
            this.crashReport.log(GDPR_DIALOG_EVENT_LISTENER_IS_NULL, HttpUrl.FRAGMENT_ENCODE_SET);
        }
        this.dialog.dismiss();
    }

    private void setPrivacyPolicyLinks(View view, Context context, final rx.s.b<String> bVar) {
        ClickableSpan clickableSpan = new ClickableSpan() { // from class: cm.aptoide.pt.home.LoggedInTermsAndConditionsDialog.1
            @Override // android.text.style.ClickableSpan
            public void onClick(View view2) {
                rx.s.b bVar2 = bVar;
                if (bVar2 == null) {
                    LoggedInTermsAndConditionsDialog.this.crashReport.log(LoggedInTermsAndConditionsDialog.GDPR_DIALOG_EVENT_LISTENER_IS_NULL, HttpUrl.FRAGMENT_ENCODE_SET);
                } else {
                    bVar2.onNext("terms");
                }
            }
        };
        ClickableSpan clickableSpan2 = new ClickableSpan() { // from class: cm.aptoide.pt.home.LoggedInTermsAndConditionsDialog.2
            @Override // android.text.style.ClickableSpan
            public void onClick(View view2) {
                rx.s.b bVar2 = bVar;
                if (bVar2 == null) {
                    LoggedInTermsAndConditionsDialog.this.crashReport.log(LoggedInTermsAndConditionsDialog.GDPR_DIALOG_EVENT_LISTENER_IS_NULL, HttpUrl.FRAGMENT_ENCODE_SET);
                } else {
                    bVar2.onNext("privacy");
                }
            }
        };
        String string = context.getString(R.string.accept_terms_message_loggedin);
        String string2 = context.getString(R.string.terms_and_conditions_privacy_sign_up_message);
        String string3 = context.getString(R.string.settings_terms_conditions);
        String string4 = context.getString(R.string.settings_privacy_policy);
        String format = String.format(string, string3, string4);
        ((Button) view.findViewById(R.id.accept_continue)).setText(String.format(string2, string3, string4));
        SpannableString spannableString = new SpannableString(format);
        spannableString.setSpan(clickableSpan, format.indexOf(string3), format.indexOf(string3) + string3.length(), 33);
        spannableString.setSpan(clickableSpan2, format.indexOf(string4), format.indexOf(string4) + string4.length(), 33);
        TextView textView = (TextView) view.findViewById(R.id.tos_info);
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void destroyDialog() {
        if (this.dialog.isShowing()) {
            this.dialog.dismiss();
        }
        this.dialog = null;
        Button button = this.continueButton;
        if (button != null) {
            button.setOnClickListener(null);
        }
        Button button2 = this.logoutButton;
        if (button2 != null) {
            button2.setOnClickListener(null);
        }
        this.continueButton = null;
        this.logoutButton = null;
        this.uiEvents = null;
    }

    public rx.e<String> dialogClicked() {
        return this.uiEvents;
    }

    public void showDialog() {
        this.dialog.show();
    }
}
