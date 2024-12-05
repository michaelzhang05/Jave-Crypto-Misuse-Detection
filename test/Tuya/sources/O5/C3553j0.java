package o5;

import E4.j;
import X4.C1496f;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: o5.j0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3553j0 extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private final W4.B f36810a;

    /* renamed from: b, reason: collision with root package name */
    private final TextView f36811b;

    /* renamed from: c, reason: collision with root package name */
    private final TextView f36812c;

    /* renamed from: d, reason: collision with root package name */
    private final TextView f36813d;

    /* renamed from: e, reason: collision with root package name */
    private final ImageView f36814e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3553j0(View itemView, W4.B b8) {
        super(itemView);
        AbstractC3159y.i(itemView, "itemView");
        this.f36810a = b8;
        View findViewById = itemView.findViewById(R.id.tv_name_rollback_item);
        AbstractC3159y.h(findViewById, "itemView.findViewById(R.id.tv_name_rollback_item)");
        TextView textView = (TextView) findViewById;
        this.f36811b = textView;
        View findViewById2 = itemView.findViewById(R.id.tv_version_rollback_item);
        AbstractC3159y.h(findViewById2, "itemView.findViewById(R.…tv_version_rollback_item)");
        TextView textView2 = (TextView) findViewById2;
        this.f36812c = textView2;
        View findViewById3 = itemView.findViewById(R.id.tv_size_rollback_item);
        AbstractC3159y.h(findViewById3, "itemView.findViewById(R.id.tv_size_rollback_item)");
        TextView textView3 = (TextView) findViewById3;
        this.f36813d = textView3;
        View findViewById4 = itemView.findViewById(R.id.iv_icon_rollback_item);
        AbstractC3159y.h(findViewById4, "itemView.findViewById(R.id.iv_icon_rollback_item)");
        this.f36814e = (ImageView) findViewById4;
        itemView.setOnClickListener(new View.OnClickListener() { // from class: o5.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3553j0.b(C3553j0.this, view);
            }
        });
        j.a aVar = E4.j.f2274g;
        textView.setTypeface(aVar.t());
        textView2.setTypeface(aVar.u());
        textView3.setTypeface(aVar.t());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C3553j0 this$0, View view) {
        int bindingAdapterPosition;
        AbstractC3159y.i(this$0, "this$0");
        if (this$0.f36810a != null && (bindingAdapterPosition = this$0.getBindingAdapterPosition()) != -1) {
            this$0.f36810a.a(bindingAdapterPosition);
        }
    }

    public final void c(C1496f item, Context context) {
        AbstractC3159y.i(item, "item");
        AbstractC3159y.i(context, "context");
        try {
            PackageManager packageManager = context.getPackageManager();
            AbstractC3159y.h(packageManager, "context.packageManager");
            String Q8 = item.Q();
            AbstractC3159y.f(Q8);
            this.f36814e.setImageDrawable(N4.q.d(packageManager, Q8, 0).applicationInfo.loadIcon(context.getPackageManager()));
        } catch (Exception e8) {
            this.f36814e.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_uptodown_logo_bag_disabled));
            e8.printStackTrace();
        }
        this.f36811b.setText(item.I());
        this.f36812c.setText(item.h0());
        this.f36813d.setText(item.a0());
    }
}
