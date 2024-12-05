package o5;

import E4.j;
import X4.C1511v;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.AlignmentSpan;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class H extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private W4.u f36582a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f36583b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f36584c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(View itemView, W4.u listener) {
        super(itemView);
        AbstractC3159y.i(itemView, "itemView");
        AbstractC3159y.i(listener, "listener");
        this.f36582a = listener;
        View findViewById = itemView.findViewById(R.id.tv_language_name_original);
        AbstractC3159y.h(findViewById, "itemView.findViewById(R.…v_language_name_original)");
        this.f36583b = (TextView) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_language_name_localized);
        AbstractC3159y.h(findViewById2, "itemView.findViewById(R.…_language_name_localized)");
        this.f36584c = (TextView) findViewById2;
        TextView textView = this.f36583b;
        j.a aVar = E4.j.f2274g;
        textView.setTypeface(aVar.u());
        this.f36584c.setTypeface(aVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(H this$0, C1511v lang, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(lang, "$lang");
        this$0.f36582a.a(lang);
    }

    public final void b(final C1511v lang, String currentLanguageCode) {
        AbstractC3159y.i(lang, "lang");
        AbstractC3159y.i(currentLanguageCode, "currentLanguageCode");
        this.f36583b.setText(lang.c());
        this.f36584c.setText(lang.b());
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: o5.G
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                H.c(H.this, lang, view);
            }
        });
        if (g6.n.s(lang.a(), "ar", false)) {
            if (!AbstractC3159y.d(currentLanguageCode, "ar")) {
                SpannableString spannableString = new SpannableString(lang.c());
                spannableString.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_OPPOSITE), 0, spannableString.length(), 33);
                this.f36583b.setText(spannableString);
                return;
            }
            return;
        }
        if (AbstractC3159y.d(currentLanguageCode, "ar")) {
            SpannableString spannableString2 = new SpannableString(lang.c());
            spannableString2.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_OPPOSITE), 0, spannableString2.length(), 33);
            this.f36583b.setText(spannableString2);
        }
    }
}
