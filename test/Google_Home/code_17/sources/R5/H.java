package r5;

import H4.j;
import a5.C1654v;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.AlignmentSpan;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class H extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private Z4.u f38790a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f38791b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f38792c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(View itemView, Z4.u listener) {
        super(itemView);
        AbstractC3255y.i(itemView, "itemView");
        AbstractC3255y.i(listener, "listener");
        this.f38790a = listener;
        View findViewById = itemView.findViewById(R.id.tv_language_name_original);
        AbstractC3255y.h(findViewById, "itemView.findViewById(R.…v_language_name_original)");
        this.f38791b = (TextView) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_language_name_localized);
        AbstractC3255y.h(findViewById2, "itemView.findViewById(R.…_language_name_localized)");
        this.f38792c = (TextView) findViewById2;
        TextView textView = this.f38791b;
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.u());
        this.f38792c.setTypeface(aVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(H this$0, C1654v lang, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(lang, "$lang");
        this$0.f38790a.a(lang);
    }

    public final void b(final C1654v lang, String currentLanguageCode) {
        AbstractC3255y.i(lang, "lang");
        AbstractC3255y.i(currentLanguageCode, "currentLanguageCode");
        this.f38791b.setText(lang.c());
        this.f38792c.setText(lang.b());
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: r5.G
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                H.c(H.this, lang, view);
            }
        });
        if (j6.n.s(lang.a(), "ar", false)) {
            if (!AbstractC3255y.d(currentLanguageCode, "ar")) {
                SpannableString spannableString = new SpannableString(lang.c());
                spannableString.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_OPPOSITE), 0, spannableString.length(), 33);
                this.f38791b.setText(spannableString);
                return;
            }
            return;
        }
        if (AbstractC3255y.d(currentLanguageCode, "ar")) {
            SpannableString spannableString2 = new SpannableString(lang.c());
            spannableString2.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_OPPOSITE), 0, spannableString2.length(), 33);
            this.f38791b.setText(spannableString2);
        }
    }
}
