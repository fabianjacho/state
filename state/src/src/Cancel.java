public class Cancel implements OrderState {

    @Override
    public void pay(Order ctx) {
        throw new IllegalStateException("No se puede pagar un pedido cancelado.");
    }

    @Override
    public void ship(Order ctx) {
        throw new IllegalStateException("No se puede enviar un pedido cancelado.");
    }

    @Override
    public void cancel(Order ctx) {
        throw new IllegalStateException("El pedido ya está cancelado.");
    }
}