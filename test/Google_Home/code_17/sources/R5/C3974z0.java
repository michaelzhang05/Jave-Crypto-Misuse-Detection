package r5;

import H4.j;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3255y;
import r5.C3974z0;

/* renamed from: r5.z0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3974z0 extends RecyclerView.ViewHolder {

    /* renamed from: r5.z0$a */
    /* loaded from: classes5.dex */
    public static final class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f39156a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f39157b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f39158c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f39159d;

        a(TextView textView, View view, String str, String str2) {
            this.f39156a = textView;
            this.f39157b = view;
            this.f39158c = str;
            this.f39159d = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(TextView tvDescription, View view, TextView textView, String readLess, String readMore, View view2) {
            AbstractC3255y.i(tvDescription, "$tvDescription");
            AbstractC3255y.i(readLess, "$readLess");
            AbstractC3255y.i(readMore, "$readMore");
            if (tvDescription.getMaxLines() == 3) {
                tvDescription.setMaxLines(Integer.MAX_VALUE);
                view.setVisibility(8);
                textView.setText(readLess);
            } else {
                tvDescription.setMaxLines(3);
                view.setVisibility(0);
                textView.setText(readMore);
            }
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f39156a.getViewTreeObserver().removeOnPreDrawListener(this);
            if (q5.v.a(this.f39156a)) {
                final View findViewById = this.f39157b.findViewById(R.id.shadow_description_category_description);
                final TextView textView = (TextView) this.f39157b.findViewById(R.id.tv_read_more_category_description);
                textView.setTypeface(H4.j.f3824g.t());
                textView.setVisibility(0);
                final TextView textView2 = this.f39156a;
                final String str = this.f39158c;
                final String str2 = this.f39159d;
                textView.setOnClickListener(new View.OnClickListener() { // from class: r5.y0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C3974z0.a.b(textView2, findViewById, textView, str, str2, view);
                    }
                });
                findViewById.setVisibility(0);
                return true;
            }
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3974z0(View itemView, String str, String str2, String readMore, String readLess) {
        super(itemView);
        AbstractC3255y.i(itemView, "itemView");
        AbstractC3255y.i(readMore, "readMore");
        AbstractC3255y.i(readLess, "readLess");
        if (str != null && str.length() != 0) {
            View findViewById = itemView.findViewById(R.id.tv_top_by_category_description);
            AbstractC3255y.h(findViewById, "itemView.findViewById(R.…_by_category_description)");
            TextView textView = (TextView) findViewById;
            j.a aVar = H4.j.f3824g;
            textView.setTypeface(aVar.u());
            textView.setText(str);
            textView.getViewTreeObserver().addOnPreDrawListener(new a(textView, itemView, readLess, readMore));
            if (str2 != null && str2.length() != 0) {
                View findViewById2 = itemView.findViewById(R.id.tv_top_by_category_title);
                AbstractC3255y.h(findViewById2, "itemView.findViewById(R.…tv_top_by_category_title)");
                TextView textView2 = (TextView) findViewById2;
                textView2.setTypeface(aVar.t());
                textView2.setText(str2);
                textView2.setVisibility(0);
                return;
            }
            return;
        }
        itemView.setVisibility(8);
    }
}
