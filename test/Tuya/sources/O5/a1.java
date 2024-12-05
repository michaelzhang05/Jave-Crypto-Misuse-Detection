package o5;

import E4.j;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3307A;

/* loaded from: classes5.dex */
public final class a1 extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f36724a;

    /* renamed from: b, reason: collision with root package name */
    private final TextView f36725b;

    /* renamed from: c, reason: collision with root package name */
    private final TextView f36726c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(View itemView, Context context, final W4.L listener) {
        super(itemView);
        AbstractC3159y.i(itemView, "itemView");
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(listener, "listener");
        View findViewById = itemView.findViewById(R.id.ll_no_tracking_container_updates);
        AbstractC3159y.h(findViewById, "itemView.findViewById(R.…acking_container_updates)");
        this.f36724a = (LinearLayout) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_no_tracking_msg_updates);
        AbstractC3159y.h(findViewById2, "itemView.findViewById(R.…_no_tracking_msg_updates)");
        TextView textView = (TextView) findViewById2;
        this.f36725b = textView;
        View findViewById3 = itemView.findViewById(R.id.tv_gdpr_set_up_updates);
        AbstractC3159y.h(findViewById3, "itemView.findViewById(R.id.tv_gdpr_set_up_updates)");
        TextView textView2 = (TextView) findViewById3;
        this.f36726c = textView2;
        j.a aVar = E4.j.f2274g;
        textView.setTypeface(aVar.u());
        textView.setText(C3307A.f34473a.c(context.getString(R.string.gdpr_no_tracking_enabled)));
        textView2.setTypeface(aVar.t());
        textView2.setOnClickListener(new View.OnClickListener() { // from class: o5.Z0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a1.b(W4.L.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(W4.L listener, View view) {
        AbstractC3159y.i(listener, "$listener");
        listener.a();
    }

    public final void c(boolean z8) {
        if (z8) {
            this.f36724a.setVisibility(0);
        } else {
            this.f36724a.setVisibility(8);
        }
    }
}
