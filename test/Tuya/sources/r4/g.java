package R4;

import E4.j;
import J4.l;
import android.view.View;
import android.widget.CheckBox;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class g extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    public CheckBox f8759a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(View itemView, final l listener) {
        super(itemView);
        AbstractC3159y.i(itemView, "itemView");
        AbstractC3159y.i(listener, "listener");
        View findViewById = itemView.findViewById(E4.e.f2134l);
        AbstractC3159y.h(findViewById, "itemView.findViewById(R.id.cb_split_item)");
        this.f8759a = (CheckBox) findViewById;
        itemView.setOnClickListener(new View.OnClickListener() { // from class: R4.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g.b(g.this, listener, view);
            }
        });
        this.f8759a.setTypeface(j.f2274g.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(g this$0, l listener, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(listener, "$listener");
        int absoluteAdapterPosition = this$0.getAbsoluteAdapterPosition();
        if (absoluteAdapterPosition != -1) {
            listener.a(view, absoluteAdapterPosition);
        }
    }
}
