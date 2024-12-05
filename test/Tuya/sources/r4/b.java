package R4;

import J4.j;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class b extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private TextView f8746a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(View itemView, final j jVar) {
        super(itemView);
        AbstractC3159y.i(itemView, "itemView");
        View findViewById = itemView.findViewById(E4.e.f2060M0);
        AbstractC3159y.h(findViewById, "itemView.findViewById(R.id.tv_device_name)");
        this.f8746a = (TextView) findViewById;
        itemView.setOnClickListener(new View.OnClickListener() { // from class: R4.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b.b(j.this, this, view);
            }
        });
        this.f8746a.setTypeface(E4.j.f2274g.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(j jVar, b this$0, View view) {
        int absoluteAdapterPosition;
        AbstractC3159y.i(this$0, "this$0");
        if (jVar != null && (absoluteAdapterPosition = this$0.getAbsoluteAdapterPosition()) != -1) {
            jVar.a(view, absoluteAdapterPosition);
        }
    }

    public final TextView c() {
        return this.f8746a;
    }
}
