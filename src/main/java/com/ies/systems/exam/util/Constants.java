package com.ies.systems.exam.util;

public class Constants {
	
	public static final String APLICATION_JSON = "application/json";

    public static class Response {
        public static final String SUCCESS = "Acción exitosa";
        public static final String BAD_REQUEST = "La petición no se procesará debido a un error a la información del cliente.";
        public static final String ACCEPTED = "La petición ha sido aceptada para procesamiento, pero este no ha sido completado. La petición eventualmente pudiere no ser satisfecha, ya que podría ser no permitida o prohibida cuando el procesamiento tenga lugar.";
        public static final String UNAUTHORIZED = "No esta autorizado";
        public static final String FORBIDDEN = "Acceso prohibido";
        public static final String UNPROCESSABLE_ENTITY = "Errores semánticos.";
        public static final String NOT_FOUND = "No se encontró el recurso";
        public static final String FAILURE = "La acción fallo";	
    }
    
    public static class Album {
    	
    	public static final String REQUEST_MAPPING = "/album";
        public static final String NAME = "Album";
        public static final String DESCRIPCION = "Gestión de albunes";
        
        public static class CrearAlbum {
            public static final String SUMMARY = "Nuevo Album";
            public static final String DESCRIPTION = "Se da de alta un nuevo Album";
            public static final String PATH = "/crear-album";
        }
        
        public static class BorrarAlbum {
            public static final String SUMMARY = "Borrar Album";
            public static final String DESCRIPTION = "Se elimina un album y sus fotografias adjuntas";
            public static final String PATH = "/borrar-album/{idAlbum}";
        }
        
        public static class AgregarFotosAlbum {
            public static final String SUMMARY = "Agregar fotografías a un Album";
            public static final String DESCRIPTION = "Se agregan una mas fotografías a un album determinado";
            public static final String PATH = "/agregar-fotos-album/{idAlbum}";
        }
    	
    }

    public static class Administracion {

        public static final String REQUEST_MAPPING = "/administracion";
        public static final String TAG = "Administración";
        public static final String DESCRIPCION = "ADMINISTRACIÓN";
        
        public static class EtiquetarParaReenvio {
            public static final String VALUE = "Etiquetar para reenvío";
            public static final String NOTES = "Se establece el estado de \"Etiquetado para reenvío\" a un envío correcto con estado final de \"Aceptado\".";
            public static final String PATH = "/etiquetar-reenvio";
        }

        public static class PermitirEnvioVacio {
            public static final String VALUE = "Permitir para envío vacío";
            public static final String NOTES = "Se permite un envío vacío.";
            public static final String PATH = "/permitir-envio-vacio";
        }

        public static class GenerarJson {
            public static final String VALUE = "Generar json a partir de un xlsx";
            public static final String NOTES = "Generar json a partir de un xlsx";
            public static final String PATH = "/generar-json";
        }

        public static class SegumientoEnvioPorIdEnvio {
            public static final String VALUE = "Seguimiento de un envio con respecto al folio de envio entregado en el acuse";
            public static final String NOTES = "Retorna la información del estado del envio correspondiente al folio de envio que se requiere.";
            public static final String PATH = "/{folioEnvio}";
        }

    }

    public static class Catalogo {

        public static final String REQUEST_MAPPING = "/catalogo";
        public static final String TAG = "Catálogos";
        public static final String DESCRIPCION = "GESTIÓN DE CATÁLOGOS";
        public static final Integer LIMITE_REGISTROS = 10000;
        public static final String LIMITE_MENSAJE = "El límite  de registros es de " + LIMITE_REGISTROS;

        public static class CatalogosPorReporte {
            public static final String VALUE = "Catálogos por reporte y fecha";
            public static final String NOTES = "Se entregan los catalogos correspondientes al reporte especificado con la clave de reporte, fecha de inicio y fin del perido deseado.";
            public static final String PATH = "/{claveReporte}/{inicioPeriodo}/{finPeriodo}";
        }

        public static class CatalogoMensajeEnvioContable {
            public static final String VALUE = "Catálogo de mensajes de los envíos de reportes contables.";
            public static final String NOTES = "Se entrega el catalogo correspondiente a los estados de los envíos de reportes contables y el catalogo correspondiente a los mensajes de error en la recepción los envíos de reportes contables.";
            public static final String PATH = "/mensaje-envio";
        }
        
        public static class CatalogoLocalidades {
            public static final String VALUE = "Catálogo de localidades.";
            public static final String NOTES = "Se entrega el catalogo correspondiente a las localidades.";
            public static final String PATH = "localidades/{page}/{size}";
        }
        
        public static class CatalogoCodigosPostales {
            public static final String VALUE = "Catálogo de códigos postales.";
            public static final String NOTES = "Se entrega el catalogo correspondiente a los códigos postales.";
            public static final String PATH = "codigosPostales/{page}/{size}";
        }
        
        public static class CatalogoCodigosPostalesPorFiltro {
            public static final String VALUE = "Catálogo de códigos postales.";
            public static final String NOTES = "Se entrega el catalogo correspondiente a los códigos postales por filtro.";
            public static final String PATH = "codigosPostales";
        }
        
        public static class CatalogoLocalidadesPorFiltro {
            public static final String VALUE = "Catálogo de localidades.";
            public static final String NOTES = "Se entrega el catalogo correspondiente a las localidades por filtro.";
            public static final String PATH = "localidades";
        }

    }

    public static class Seguimiento {

        public static final String REQUEST_MAPPING = "/seguimiento";
        public static final String TAG = "Seguimiento de envios";
        public static final String DESCRIPCION = "CONSULTA DE ESTATUS DE LOS ENVÍOS REALIZADOS";

        public static class SegumientoEnvioPorIdEnvio {
            public static final String VALUE = "Seguimiento de un envio con respecto al folio de envio entregado en el acuse";
            public static final String NOTES = "Retorna la información del estado del envio correspondiente al folio de envio que se requiere.";
            public static final String PATH = "/{folioEnvio}";
        }

        public static class SegumientoEnvioByEstatus {
            public static final String VALUE = "Seguimiento de los envios respecto al estatus de envio";
            public static final String NOTES = "Retorna la información de los envios respecto al estatus de envio que se requiere.";
            public static final String PATH = "/{claveReporte}/{estatus}";
        }

        public static class SegumientoEnvioPorReporte {
            public static final String VALUE = "Seguimiento de los envíos correspondientes a un Reporte dado";
            public static final String NOTES = "Retorna la información de los envíos correspondientes a un Reporte dado";
            public static final String PATH = "/reporte/{reporte}";
        }
    }

    public static class Reporte {

        public static final String REQUEST_MAPPING = "/reporte";
        public static final String TAG = "Reportes";
        public static final String DESCRIPCION = "CONSULTA DE REPORTES";

        public static class ReportesPendientes {
            public static final String VALUE = "Reportes pendientes";
            public static final String NOTES = "Retorna una lista con los reportes pendientes por entregar.";
            public static final String PATH = "/pendientes";
        }
    }
    
    public static class SerieR01 {
        
        public static final String REQUEST_MAPPING = "/R01";
        public static final String TAG = "Serie R01";         
        public static final String DESCRIPCION = "CATÁLOGO MÍNIMO";

        public static class A_0111 {
            public static final String VALUE = "Catálogo mínimo";
            public static final String NOTES = "En este reporte se solicitan los saldos al cierre del período de todos los conceptos que forman parte del estado de situación financiera (incluyendo las cuentas de orden) y del estado de resultado integral de la Institución de Fondos de Pago Electrónico. ";
            public static final String PATH = "/IFPE/R01/111";
            public static final String PATH_CORRECCION = "/IFPE/R01/111/correccion/{folio}";
            public static final String PATH_REENVIO = "/IFPE/R01/111/reenvio/{folio}";
            public static final String JSON_SCHEMA = "111_JSON_SCHM";
            public static final String CLAVE_REPORTE = "111";
        }

        public static class A_0112 {
            public static final String VALUE = "Catálogo mínimo";
            public static final String NOTES = "En este reporte se solicitan los saldos al cierre del período de todos los conceptos que forman parte del estado de situación financiera (incluyendo las cuentas de orden) y del estado de resultado integral de la Institución de Financiamiento Colectivo.";
            public static final String PATH = "/IFC/R01/112";
            public static final String PATH_CORRECCION = "/IFC/R01/112/correccion/{folio}";
            public static final String PATH_REENVIO = "/IFC/R01/112/reenvio/{folio}";
            public static final String JSON_SCHEMA = "112_JSON_SCHM";
            public static final String CLAVE_REPORTE = "112";
        }
    }

    public static class SerieR08 {

        public static final String REQUEST_MAPPING = "/R08";
        public static final String TAG = "Serie R08";
        public static final String DESCRIPCION = "PRÉSTAMOS BANCARIOS Y DE OTROS ORGANISMOS";

        public static class D_0842 {
            public static final String VALUE = "Desagregado de préstamos obtenidos";
            public static final String NOTES = "En este reporte se recaba información que permite conocer el detalle de los préstamos otorgados a las Instituciones de Financiamiento Colectivo, tales como la fecha de contratación del crédito, la fecha de vencimiento, el monto de la operación, la tasa de interés pactada, las garantías que lo respaldan, la identificación del prestamista, las comisiones pagadas, entre otros, así como la información del seguimiento del crédito.";
            public static final String PATH = "/IFC/R08/842";
            public static final String PATH_CORRECCION = "/IFC/R08/842/correccion/{folio}";
            public static final String PATH_REENVIO = "/IFC/R08/842/reenvio/{folio}";
            public static final String PATH_ENVIO_VACIO = "/IFC/R08/842/envio-vacio";
            public static final String JSON_SCHEMA = "842_JSON_SCHM";
            public static final String JSON_SCHEMA_VACIO = "842_VACIO_JSON_SCHM";
            public static final String CLAVE_REPORTE = "842";
        }

        public static class D_0843 {
            public static final String VALUE = "Desagregado de préstamos obtenidos";
            public static final String NOTES = "En este reporte se recaba información que permite conocer el detalle de los préstamos otorgados a las Instituciones de Fondos de Pago Electrónico, tales como la fecha de contratación del crédito, la fecha de vencimiento, el monto de la operación, la tasa de interés pactada, las garantías que lo respaldan, la identificación del prestamista, las comisiones pagadas, entre otros, así como la información del seguimiento del crédito.";
            public static final String PATH = "/IFPE/R08/843";
            public static final String PATH_CORRECCION = "/IFPE/R08/843/correccion/{folio}";
            public static final String PATH_REENVIO = "/IFPE/R08/843/reenvio/{folio}";
            public static final String PATH_ENVIO_VACIO = "/IFPE/R08/843/envio-vacio";
            public static final String JSON_SCHEMA = "843_JSON_SCHM";
            public static final String JSON_SCHEMA_VACIO = "843_VACIO_JSON_SCHM";
            public static final String CLAVE_REPORTE = "843";
        }

    }

    public static class SerieR10 {

        public static final String REQUEST_MAPPING = "/R10";
        public static final String TAG = "Serie R10";
        public static final String DESCRIPCION = "RECLASIFICACIONES";

        public static class A_10112 {
            public static final String VALUE = "Reclasificaciones en el estado de situación financiera";
            public static final String NOTES = "En este reporte se solicitan saldos al cierre del período de los conceptos del reporte regulatorio A-0112 Catálogo mínimo, así como los respectivos movimientos por presentación y compensaciones conforme a criterios contables realizados para fines de presentación de los rubros del estado de situación financiera de la Institución de Financiamiento Colectivo sin consolidar.";
            public static final String PATH = "/IFC/R10/10112";
            public static final String PATH_CORRECCION = "/IFC/R10/10112/correccion/{folio}";
            public static final String PATH_REENVIO = "/IFC/R10/10112/reenvio/{folio}";
            public static final String JSON_SCHEMA = "10112_JSON_SCHM";
            public static final String CLAVE_REPORTE = "10112";
        }

        public static class A_10122 {
            public static final String VALUE = "Reclasificaciones en el estado de resultado integral";
            public static final String NOTES = "En este reporte se solicitan saldos al cierre del período de los conceptos del reporte regulatorio A-0112 Catálogo mínimo, así como los respectivos movimientos por presentación y compensaciones conforme a criterios contables realizados para fines de presentación de los rubros del estado de resultado integral de la Institución de Financiamiento Colectivo sin consolidar.";
            public static final String PATH = "/IFC/R10/10122";
            public static final String PATH_CORRECCION = "/IFC/R10/10122/correccion/{folio}";
            public static final String PATH_REENVIO = "/IFC/R10/10122/reenvio/{folio}";
            public static final String JSON_SCHEMA = "10122_JSON_SCHM";
            public static final String CLAVE_REPORTE = "10122";
        }

        public static class A_10111 {
            public static final String VALUE = "Reclasificaciones en el estado de situación financiera";
            public static final String NOTES = "En este reporte se solicitan saldos al cierre del período de los conceptos del reporte regulatorio A-0111 Catálogo mínimo, así como los respectivos movimientos por presentación y compensaciones conforme a criterios contables realizados para fines de presentación de los rubros del estado de situación financiera de la Institución de Fondos de Pago Electrónico sin consolidar.";
            public static final String PATH = "/IFPE/R10/10111";
            public static final String PATH_CORRECCION = "/IFPE/R10/10111/correccion/{folio}";
            public static final String PATH_REENVIO = "/IFPE/R10/10111/reenvio/{folio}";
            public static final String JSON_SCHEMA = "10111_JSON_SCHM";
            public static final String CLAVE_REPORTE = "10111";
        }

        public static class A_10121 {
            public static final String VALUE = "Reclasificaciones en el estado de resultado integral";
            public static final String NOTES = "En este reporte se solicitan saldos al cierre del período de los conceptos del reporte regulatorio A-0111 Catálogo mínimo, así como los respectivos movimientos por presentación y compensaciones conforme a criterios contables realizados para fines de presentación de los rubros del estado de resultado integral de la Institución de Fondos de Pago Electrónico sin consolidar.";
            public static final String PATH = "/IFPE/R10/10121";
            public static final String PATH_CORRECCION = "/IFPE/R10/10121/correccion/{folio}";
            public static final String PATH_REENVIO = "/IFPE/R10/10121/reenvio/{folio}";
            public static final String JSON_SCHEMA = "10121_JSON_SCHM";
            public static final String CLAVE_REPORTE = "10121";
        }
    }

    public static class SerieR13 {

        public static final String REQUEST_MAPPING = "/R13";
        public static final String TAG = "Serie R13";
        public static final String DESCRIPCION = "ESTADOS FINANCIEROS";

        public static class A_13112{
            public static final String VALUE = "Estado de cambios en el capital contable";
            public static final String NOTES = "El estado de cambios en el capital contable tiene por objetivo presentar información sobre los cambios en la inversión de los propietarios de la Institución de Financiamiento Colectivo durante el periodo contable. Debe mostrar la conciliación entre saldos iniciales y finales del periodo de cada uno de los rubros que forman parte del capital contable.";
            public static final String PATH = "/IFC/R13/13112";
            public static final String PATH_CORRECCION = "/IFC/R13/13112/correccion/{folio}";
            public static final String PATH_REENVIO = "/IFC/R13/13112/reenvio/{folio}";
            public static final String CLAVE_REPORTE = "13112";
            public static final String JSON_SCHEMA = "13112_JSON_SCHM";
        }

        public static class A_13162{
            public static final String VALUE = "Estado de flujos de efectivo";
            public static final String NOTES = "El estado de flujos de efectivo tiene como objetivo principal proporcionar información acerca de los cambios en los recursos y las fuentes de financiamiento en el periodo contable. Los cambios se refieren a las diferencias clasificadas de acuerdo a los recursos generados o utilizados por la operación, por actividades de financiamiento y por actividades de inversión. Asimismo, deberá reflejarse el aumento o disminución de efectivo y equivalentes en el periodo.";
            public static final String PATH = "/IFC/R13/13162";
            public static final String PATH_CORRECCION = "/IFC/R13/13162/correccion/{folio}";
            public static final String PATH_REENVIO = "/IFC/R13/13162/reenvio/{folio}";
            public static final String CLAVE_REPORTE = "13162";
            public static final String JSON_SCHEMA = "13162_JSON_SCHM";
        }

        public static class B_13212 {
            public static final String VALUE = "Estado de Situación Financiera";
            public static final String NOTES = "El estado de situación financiera tiene por objetivo presentar el valor de los bienes y derechos, de las obligaciones reales, directas o contingentes, así como del capital contable de la Institución de Financiamiento Colectivo a una fecha determinada.";
            public static final String PATH = "/IFC/R13/13212";
            public static final String PATH_CORRECCION = "/IFC/R13/13212/correccion/{folio}";
            public static final String PATH_REENVIO = "/IFC/R13/13212/reenvio/{folio}";
            public static final String CLAVE_REPORTE = "13212";
            public static final String JSON_SCHEMA = "13212_JSON_SCHM";
        }

        public static class B_13222 {
            public static final String VALUE = "Estado de resultado integral";
            public static final String NOTES = "Es estado de resultado integral tiene por objetivo mostrar información relativa al resultado de sus operaciones en el capital contable y, por ende, de los ingresos y gastos y otros resultados integrales (ORI) y resultado integral. En este reporte se solicita la información relevante sobre las operaciones realizadas por la Institución de Financiamiento Colectivo y deberá cumplir con el objetivo de ser una herramienta útil para el análisis.";
            public static final String PATH = "/IFC/R13/13222";
            public static final String PATH_CORRECCION = "/IFC/R13/13222/correccion/{folio}";
            public static final String PATH_REENVIO = "/IFC/R13/13222/reenvio/{folio}";
            public static final String CLAVE_REPORTE = "13222";
            public static final String JSON_SCHEMA = "13222_JSON_SCHM";
        }

        public static class A_13111 {
            public static final String VALUE = "Estado de cambios en el capital contable";
            public static final String NOTES = "El estado de cambios en el capital contable tiene por objetivo presentar información sobre los cambios en la inversión de los propietarios de la Institución de Fondos de Pago Electrónico durante el periodo contable. Debe mostrar la conciliación entre saldos iniciales y finales del periodo de cada uno de los rubros que forman parte del capital contable. En este reporte se solicitan los saldos de todos los conceptos del capital contable de la Institución de Fondos de Pago Electrónico, mostrando los movimientos ocurridos en el período que se reporta. Los movimientos se refieren a los incrementos o decrementos del capital contable originados por movimientos de propietarios, movimientos de reservas y resultado integral.\n";
            public static final String PATH = "/IFPE/R13/13111";
            public static final String PATH_CORRECCION = "/IFPE/R13/13111/correccion/{folio}";
            public static final String PATH_REENVIO = "/IFPE/R13/13111/reenvio/{folio}";
            public static final String CLAVE_REPORTE = "13111";
            public static final String JSON_SCHEMA = "13111_JSON_SCHM";
        }

        public static class A_13161 {
            public static final String VALUE = "Estado de flujos de efectivo";
            public static final String NOTES = "El estado de flujos de efectivo tiene como objetivo principal proporcionar información acerca de los cambios en los recursos y las fuentes de financiamiento en el periodo contable. Los cambios se refieren a las diferencias clasificadas de acuerdo a los recursos generados o utilizados por la operación, por actividades de financiamiento y por actividades de inversión.\n Asimismo, deberá reflejarse el aumento o disminución de efectivo y equivalentes en el periodo.\n";
            public static final String PATH = "/IFPE/R13/13161";
            public static final String PATH_CORRECCION = "/IFPE/R13/13161/correccion/{folio}";
            public static final String PATH_REENVIO = "/IFPE/R13/13161/reenvio/{folio}";
            public static final String CLAVE_REPORTE = "13161";
            public static final String JSON_SCHEMA = "13161_JSON_SCHM";
        }

        public static class B_13211 {
            public static final String VALUE = "Estado de situación financiera";
            public static final String NOTES = "El estado de situación financiera tiene por objetivo presentar el valor de los bienes y derechos, de las obligaciones reales, directas o contingentes, así como del capital contable de la Institución de Fondos de Pago Electrónico a una fecha determinada.\nEl estado de situación financiera, por lo tanto, deberá mostrar de manera adecuada y sobre bases consistentes, la posición de la institución en cuanto a sus activos, pasivos, capital contable y cuentas de orden, de tal forma que se puedan evaluar los recursos económicos con que cuenta la institución, así como su estructura financiera.\nAdicionalmente, el estado de situación financiera deberá cumplir con el objetivo de ser una herramienta útil para el análisis.\n";
            public static final String PATH = "/IFPE/R13/13211";
            public static final String PATH_CORRECCION = "/IFPE/R13/13211/correccion/{folio}";
            public static final String PATH_REENVIO = "/IFPE/R13/13211/reenvio/{folio}";
            public static final String CLAVE_REPORTE = "13211";
            public static final String JSON_SCHEMA = "13211_JSON_SCHM";
        }

        public static class B_13221 {
            public static final String VALUE = "Estado de resultado integral";
            public static final String NOTES = "Es estado de resultado integral tiene por objetivo mostrar información relativa al resultado de sus operaciones en el capital contable y, por ende, de los ingresos y gastos y otros resultados integrales (ORI) y resultado integral. \nEn este reporte se solicita la información relevante sobre las operaciones realizadas por la Institución de Fondos de Pago Electrónico y deberá cumplir con el objetivo de ser una herramienta útil para el análisis.\n";
            public static final String PATH = "/IFPE/R13/13221";
            public static final String PATH_CORRECCION = "/IFPE/R13/13221/correccion/{folio}";
            public static final String PATH_REENVIO = "/IFPE/R13/13221/reenvio/{folio}";
            public static final String CLAVE_REPORTE = "13221";
            public static final String JSON_SCHEMA = "13221_JSON_SCHM";
        }
    }

    public static class SerieR24 {

        public static final String REQUEST_MAPPING = "/R24";
        public static final String TAG = "Serie R24";
        public static final String DESCRIPCION = "INFORMACIÓN OPERATIVA";

        public static class G_2421 {
            public static final String VALUE = "Información de Solicitantes.";
            public static final String NOTES = "En este reporte se recaba información de identificación de los Solicitantes en la Institución de Financiamiento Colectivo.";
            public static final String PATH = "/IFC/R24/2421";
            public static final String PATH_CORRECCION = "/IFC/R24/2421/correccion/{folio}";
            public static final String PATH_REENVIO = "/IFC/R24/2421/reenvio/{folio}";
            public static final String JSON_SCHEMA = "2421_JSON_SCHM";
            public static final String CLAVE_REPORTE = "2421";
        }

        public static class G_2422 {
            public static final String VALUE = "Información de Inversionistas.";
            public static final String NOTES = "Este reporte recaba información de identificación de los Inversionistas de la Institución de Financiamiento Colectivo.";
            public static final String PATH = "/IFC/R24/2422";
            public static final String PATH_CORRECCION = "/IFC/R24/2422/correccion/{folio}";
            public static final String PATH_REENVIO = "/IFC/R24/2422/reenvio/{folio}";
            public static final String JSON_SCHEMA = "2422_JSON_SCHM";
            public static final String CLAVE_REPORTE = "2422";
        }

        public static class G_2423 {
            public static final String VALUE = "Segregación de cuentas propias.";
            public static final String NOTES = "Este reporte recaba información referente a las cuentas o fideicomisos que las Instituciones de Financiamiento Colectivo utilizan para el manejo de recursos propios.";
            public static final String PATH = "/IFC/R24/2423";
            public static final String PATH_CORRECCION = "/IFC/R24/2423/correccion/{folio}";
            public static final String PATH_REENVIO = "/IFC/R24/2423/reenvio/{folio}";
            public static final String JSON_SCHEMA = "2423_JSON_SCHM";
            public static final String CLAVE_REPORTE = "2423";
        }

        public static class G_2424 {
            public static final String VALUE = "Segregación de cuentas para el manejo de recursos de los Clientes.";
            public static final String NOTES = "En este reporte se recaba información referente a los saldos de las cuentas o fideicomisos que las Instituciones de Financiamiento Colectivo utilizan para el manejo de los recursos de sus Clientes.";
            public static final String PATH = "/IFC/R24/2424";
            public static final String PATH_CORRECCION = "/IFC/R24/2424/correccion/{folio}";
            public static final String PATH_REENVIO = "/IFC/R24/2424/reenvio/{folio}";
            public static final String JSON_SCHEMA = "2424_JSON_SCHM";
            public static final String CLAVE_REPORTE = "2424";
        }

        public static class G_2412 {
            public static final String VALUE = "Información de clientes.";
            public static final String NOTES = "En este reporte se recaba información que permite conocer diversas características de los clientes de las Instituciones de Fondos de Pago Electrónico, tales como el tipo de persona (física o moral), su ocupación, su nacionalidad, entre otros elementos.";
            public static final String PATH = "/IFC/R24/2412";
            public static final String PATH_CORRECCION = "/IFC/R24/2412/correccion/{folio}";
            public static final String PATH_REENVIO = "/IFC/R24/2412/reenvio/{folio}";
            public static final String JSON_SCHEMA = "2412_JSON_SCHM";
            public static final String CLAVE_REPORTE = "2412";
        }

        public static class G_2442 {
            public static final String VALUE = "Información de cuentas.";
            public static final String NOTES = "En este reporte se recaba información que permite conocer detalles de la(s) cuenta(s) de los Clientes de las Instituciones de Fondos de Pago Electrónico, tal como el nivel de la cuenta, el tipo de moneda referenciada a la cuenta o cuentas del Cliente, entre otros elementos.";
            public static final String PATH = "/IFC/R24/2442";
            public static final String PATH_CORRECCION = "/IFC/R24/2442/correccion/{folio}";
            public static final String PATH_REENVIO = "/IFC/R24/2442/reenvio/{folio}";
            public static final String JSON_SCHEMA = "2442_JSON_SCHM";
            public static final String CLAVE_REPORTE = "2442";
        }

        public static class H_2481 {
            public static final String VALUE = "Información de solicitantes.";
            public static final String NOTES = "Este reporte recaba información para identificar a cada uno de los solicitantes en la IFC.";
            public static final String PATH = "/IFC/R24/2481";
            public static final String PATH_CORRECCION = "/IFC/R24/2481/correccion/{folio}";
            public static final String PATH_REENVIO = "/IFC/R24/2481/reenvio/{folio}";
            public static final String JSON_SCHEMA = "2481_JSON_SCHM";
            public static final String CLAVE_REPORTE = "2481";
            public static final String PATH_ENVIO_VACIO = "/IFC/R24/2481/envio-vacio";
            public static final String JSON_SCHEMA_VACIO = "2481_VACIO_JSON_SCHM";
        }

        public static class H_2482 {
            public static final String VALUE = "Información de Inversionistas.";
            public static final String NOTES = "Este reporte recaba información para identificar a cada uno de los inversionistas, personas físicas y morales, registrados en la Institución de Financiamiento Colectivo.";
            public static final String PATH = "/IFC/R24/2482";
            public static final String PATH_CORRECCION = "/IFC/R24/2482/correccion/{folio}";
            public static final String PATH_REENVIO = "/IFC/R24/2482/reenvio/{folio}";
            public static final String JSON_SCHEMA = "2482_JSON_SCHM";
            public static final String CLAVE_REPORTE = "2482";
            public static final String PATH_ENVIO_VACIO = "/IFC/R24/2482/envio-vacio";
            public static final String JSON_SCHEMA_VACIO = "2482_VACIO_JSON_SCHM";
        }

        public static class G_2471 {
            public static final String VALUE = "Información de clientes.";
            public static final String NOTES = "En este reporte se recaba información de los clientes de las IFPE.";
            public static final String PATH = "/IFPE/R24/2471";
            public static final String PATH_CORRECCION = "/IFPE/R24/2471/correccion/{folio}";
            public static final String PATH_REENVIO = "/IFPE/R24/2471/reenvio/{folio}";
            public static final String JSON_SCHEMA = "2471_JSON_SCHM";
            public static final String CLAVE_REPORTE = "2471";
            public static final String PATH_ENVIO_VACIO = "/IFPE/R24/2471/envio-vacio";
            public static final String JSON_SCHEMA_VACIO = "2471_VACIO_JSON_SCHM";
        }

        public static class G_2472 {
            public static final String VALUE = "Información de cuentas.";
            public static final String NOTES = "En este reporte se recaba información que permite conocer detalles de la(s) cuenta(s) de los clientes de las IFPE.";
            public static final String PATH = "/IFPE/R24/2472";
            public static final String PATH_CORRECCION = "/IFPE/R24/2472/correccion/{folio}";
            public static final String PATH_REENVIO = "/IFPE/R24/2472/reenvio/{folio}";
            public static final String JSON_SCHEMA = "2472_JSON_SCHM";
            public static final String CLAVE_REPORTE = "2472";
            public static final String PATH_ENVIO_VACIO = "/IFPE/R24/2472/envio-vacio";
            public static final String JSON_SCHEMA_VACIO = "2472_VACIO_JSON_SCHM";
        }
    }

    public static class SerieR26 {

        public static final String REQUEST_MAPPING = "/R26";
        public static final String TAG = "Serie R26";
        public static final String DESCRIPCION = "INFORMACIÓN DE COMISIONISTAS";

        public static class A_2610 {
            public static final String VALUE = "Altas y bajas de administradores de comisionistas";
            public static final String NOTES = "Este reporte recaba información referente a los movimientos de Altas y/o Bajas de los Administradores de Comisionistas, que sean contratados por la Institución de Fondos de Pago Electrónico para que sean intermediarios entre los comisionistas y la Institución.";
            public static final String PATH = "/IFPE/R26/2610";
            public static final String PATH_CORRECCION = "/IFPE/R26/2610/correccion/{folio}";
            public static final String PATH_REENVIO = "/IFPE/R26/2610/reenvio/{folio}";
            public static final String JSON_SCHEMA = "2610_JSON_SCHM";
            public static final String CLAVE_REPORTE = "2610";
        }

        public static class A_2611 {
            public static final String VALUE = "Desagregado de altas y bajas de comisionistas";
            public static final String NOTES = "Este reporte recaba información referente al tipo de servicio y operaciones contratadas con los comisionistas, las actualizaciones en las condiciones del contrato mercantil y las causas que dan origen a la baja del contrato.";
            public static final String PATH = "/IFPE/R26/2611";
            public static final String PATH_CORRECCION = "/IFPE/R26/2611/correccion/{folio}";
            public static final String PATH_REENVIO = "/IFPE/R26/2611/reenvio/{folio}";
            public static final String JSON_SCHEMA = "2611_JSON_SCHM";
            public static final String CLAVE_REPORTE = "2611";
        }

        public static class B_2612 {
            public static final String VALUE = "Desagregado de altas y bajas de módulos o establecimientos de comisionistas";
            public static final String NOTES = "Este reporte recaba información referente a los módulos o establecimientos que los comisionistas bancarios y cambiarios tengan habilitados para representar a las propias Instituciones de Fondos de Pago Electrónico con sus clientes y con el público en general, reportando a la CNBV los movimientos de altas, bajas y/o actualizaciones de dichos módulos o establecimientos.";
            public static final String PATH = "/IFPE/R26/2612";
            public static final String PATH_CORRECCION = "/IFPE/R26/2612/correccion/{folio}";
            public static final String PATH_REENVIO = "/IFPE/R26/2612/reenvio/{folio}";
            public static final String JSON_SCHEMA = "2612_JSON_SCHM";
            public static final String CLAVE_REPORTE = "2612";
        }

        public static class C_2613 {
            public static final String VALUE = "Desagregado de seguimiento de operaciones de comisionistas";
            public static final String NOTES = "Este reporte permite observar en el tiempo los posibles cambios que se presenten en el tipo y número de operaciones contratadas, así como conocer los flujos generados, por las operaciones de recepción de recursos en efectivo.";
            public static final String PATH = "/IFPE/R26/2613";
            public static final String PATH_CORRECCION = "/IFPE/R26/2613/correccion/{folio}";
            public static final String PATH_REENVIO = "/IFPE/R26/2613/reenvio/{folio}";
            public static final String JSON_SCHEMA = "2613_JSON_SCHM";
            public static final String CLAVE_REPORTE = "2613";
            public static final String PATH_ENVIO_VACIO = "/IFPE/R26/2613/envio-vacio";
            public static final String JSON_SCHEMA_VACIO = "2613_VACIO_JSON_SCHM";
        }

    }

    public static class SerieR27 {

        public static final String REQUEST_MAPPING = "/R27";
        public static final String TAG = "Serie R27";
        public static final String DESCRIPCION = "RECLAMACIONES";

        public static class A_2701 {
            public static final String VALUE = "Reclamaciones";
            public static final String NOTES = "En este reporte se recaba información referente a las reclamaciones relativas a operaciones con fondos de pago electrónico realizadas por los Clientes, agrupadas por productos y canales transaccionales de las Instituciones de Fondos de Pago Electrónico. Adicionalmente, este reporte considera información respecto de los datos de la gestión de dichas reclamaciones.";
            public static final String PATH = "/IFPE/R27/2701";
            public static final String PATH_CORRECCION = "/IFPE/R27/2701/correccion/{folio}";
            public static final String PATH_REENVIO = "/IFPE/R27/2701/reenvio/{folio}";
            public static final String CLAVE_REPORTE = "2701";
            public static final String JSON_SCHEMA = "2701_JSON_SCHM";
            public static final String PATH_ENVIO_VACIO = "/IFPE/R27/2701/envio-vacio";
            public static final String JSON_SCHEMA_VACIO = "2701_VACIO_JSON_SCHM";
        }

        public static class A_2702 {
            public static final String VALUE = "Reclamaciones";
            public static final String NOTES = "En este reporte se recaba información referente a las reclamaciones relativas a operaciones de financiamiento colectivo realizadas por los Clientes de las Instituciones de Financiamiento Colectivo. Adicionalmente, este reporte considera información respecto de los datos de la gestión de dichas reclamaciones.";
            public static final String PATH = "/IFC/R27/2702";
            public static final String PATH_CORRECCION = "/IFC/R27/2702/correccion/{folio}";
            public static final String PATH_REENVIO = "/IFC/R27/2702/reenvio/{folio}";
            public static final String CLAVE_REPORTE = "2702";
            public static final String JSON_SCHEMA = "2702_JSON_SCHM";
            public static final String PATH_ENVIO_VACIO = "/IFC/R27/2702/envio-vacio";
            public static final String JSON_SCHEMA_VACIO = "2702_VACIO_JSON_SCHM";
        }
    }

    public static class SerieR36 {

        public static final String REQUEST_MAPPING = "/R36";
        public static final String TAG = "Serie R36";
        public static final String DESCRIPCION = "FINANCIAMIENTOS";

        public static class D_3601 {
            public static final String VALUE = "Información de Financiamientos Colectivos de Capital, Copropiedad o Regalías.";
            public static final String NOTES = "En este reporte se recaba información sobre los datos generales de los financiamientos colectivos de Capital y de Copropiedad o Regalías, así como el seguimiento a las etapas del  financiamiento efectivo, el pago de los solicitantes,  el cobro de las comisiones y la situación de la recuperación de los pagos.";
            public static final String PATH = "/IFC/R36/3601";
            public static final String PATH_CORRECCION = "/IFC/R36/3601/correccion/{folio}";
            public static final String PATH_REENVIO = "/IFC/R36/3601/reenvio/{folio}";
            public static final String CLAVE_REPORTE = "3601";
            public static final String JSON_SCHEMA = "3601_JSON_SCHM";
        }

        public static class D_3602 {
            public static final String VALUE = "Información de Financiamientos Colectivos de Deuda.";
            public static final String NOTES = "Este reporte recaba información sobre los datos generales del financiamiento colectivo de Deuda, así como el seguimiento a las etapas del financiamiento efectivo, el pago de los solicitantes, el cobro de las comisiones y la situación de la recuperación de los pagos.";
            public static final String PATH = "/IFC/R36/3602";
            public static final String PATH_CORRECCION = "/IFC/R36/3602/correccion/{folio}";
            public static final String PATH_REENVIO = "/IFC/R36/3602/reenvio/{folio}";
            public static final String CLAVE_REPORTE = "3602";
            public static final String JSON_SCHEMA = "3602_JSON_SCHM";
        }

        public static class D_3603 {
            public static final String VALUE = "Información de garantías de Financiamientos Colectivos de Deuda.";
            public static final String NOTES = "Este reporte recaba información de las características de la garantía que respalda el financiamiento colectivo.";
            public static final String PATH = "/IFC/R36/3603";
            public static final String PATH_CORRECCION = "/IFC/R36/3603/correccion/{folio}";
            public static final String PATH_REENVIO = "/IFC/R36/3603/reenvio/{folio}";
            public static final String CLAVE_REPORTE = "3603";
            public static final String JSON_SCHEMA = "3603_JSON_SCHM";
        }

        public static class D_3604 {
            public static final String VALUE = "Información de operaciones de Inversionistas.";
            public static final String NOTES = "Este reporte recaba información para conocer las operaciones, aportaciones y retornos de inversión de los inversionistas, en relación con cada una de las operaciones de financiamiento colectivo a través de las Instituciones de Financiamiento Colectivo.";
            public static final String PATH = "/IFC/R36/3604";
            public static final String PATH_CORRECCION = "/IFC/R36/D-3604/correccion/{folio}";
            public static final String PATH_REENVIO = "/IFC/R36/D-3604/reenvio/{folio}";
            public static final String CLAVE_REPORTE = "3604";
            public static final String JSON_SCHEMA = "3604_JSON_SCHM";
        }

        public static class D_3608 {
            public static final String VALUE = "Información de operaciones en mercado secundario.";
            public static final String NOTES = "Este reporte recaba información de identificación de las operaciones en mercado secundario llevadas a cabo por la Institución de Financiamiento Colectivo.";
            public static final String PATH = "/IFC/R36/D-3608";
            public static final String PATH_CORRECCION = "/IFC/R36/D-3608/correccion/{folio}";
            public static final String PATH_REENVIO = "/IFC/R36/D-3608/reenvio/{folio}";
            public static final String CLAVE_REPORTE = "D-3608";
            public static final String JSON_SCHEMA = "D3608_JSON_SCHM";
        }

        public static class D_3610 {
            public static final String VALUE = "Información de comisiones cobradas.";
            public static final String NOTES = "Este reporte recaba información acumulada de las comisiones cobradas por la Institución de Financiamiento Colectivo a sus Clientes.";
            public static final String PATH = "/IFC/R36/3610";
            public static final String PATH_CORRECCION = "/IFC/R36/3610/correccion/{folio}";
            public static final String PATH_REENVIO = "/IFC/R36/3610/reenvio/{folio}";
            public static final String CLAVE_REPORTE = "3610";
            public static final String JSON_SCHEMA = "3610_JSON_SCHM";
        }

        public static class D_3621 {
            public static final String VALUE = "Movimientos en cuentas utilizadas para el manejo de recursos de los clientes.";
            public static final String NOTES = "Este reporte recaba información sobre el detalle del saldo de las cuentas o fideicomisos que las IFC utilizan para el manejo de los recursos de sus clientes.";
            public static final String PATH = "/IFC/R36/3621";
            public static final String PATH_CORRECCION = "/IFC/R36/3621/correccion/{folio}";
            public static final String PATH_REENVIO = "/IFC/R36/3621/reenvio/{folio}";
            public static final String CLAVE_REPORTE = "3621";
            public static final String JSON_SCHEMA = "3621_JSON_SCHM";
            public static final String PATH_ENVIO_VACIO = "/IFC/R36/3621/envio-vacio";
            public static final String JSON_SCHEMA_VACIO = "3621_VACIO_JSON_SCHM";
        }
        public static class D_3622 {
            public static final String VALUE = "Información de financiamientos colectivos de Capital, Copropiedad o Regalías.";
            public static final String NOTES = "Este reporte recaba información para identificar el tipo y las características de la operación del financiamiento colectivo de capita.";
            public static final String PATH = "/IFC/R36/3622";
            public static final String PATH_CORRECCION = "/IFC/R36/3622/correccion/{folio}";
            public static final String PATH_REENVIO = "/IFC/R36/3622/reenvio/{folio}";
            public static final String CLAVE_REPORTE = "3622";
            public static final String JSON_SCHEMA = "3622_JSON_SCHM";
            public static final String PATH_ENVIO_VACIO = "/IFC/R36/3622/envio-vacio";
            public static final String JSON_SCHEMA_VACIO = "3622_VACIO_JSON_SCHM";
        }
        public static class D_3623 {
            public static final String VALUE = "Información de financiamientos colectivos de deuda.";
            public static final String NOTES = "Este reporte recaba información para identificar el tipo y características de la operación de financiamiento colectivo de deuda.";
            public static final String PATH = "/IFC/R36/3623";
            public static final String PATH_CORRECCION = "/IFC/R36/3623/correccion/{folio}";
            public static final String PATH_REENVIO = "/IFC/R36/3623/reenvio/{folio}";
            public static final String CLAVE_REPORTE = "3623";
            public static final String JSON_SCHEMA = "3623_JSON_SCHM";
            public static final String PATH_ENVIO_VACIO = "/IFC/R36/3623/envio-vacio";
            public static final String JSON_SCHEMA_VACIO = "3623_VACIO_JSON_SCHM";
        }
        public static class D_3624 {
            public static final String VALUE = "Información de garantías de financiamientos colectivos de deuda.";
            public static final String NOTES = "Este reporte recaba información de las características de las garantías que respaldan los financiamientos colectivos de deuda.";
            public static final String PATH = "/IFC/R36/3624";
            public static final String PATH_CORRECCION = "/IFC/R36/3624/correccion/{folio}";
            public static final String PATH_REENVIO = "/IFC/R36/3624/reenvio/{folio}";
            public static final String CLAVE_REPORTE = "3624";
            public static final String JSON_SCHEMA = "3624_JSON_SCHM";
            public static final String PATH_ENVIO_VACIO = "/IFC/R36/3624/envio-vacio";
            public static final String JSON_SCHEMA_VACIO = "3624_VACIO_JSON_SCHM";
        }
        public static class D_3625 {
            public static final String VALUE = "Información de Operaciones de Inversionistas.";
            public static final String NOTES = "Este reporte recaba información agregada de los saldos en la cuenta que tiene cada inversionista en la IFC.";
            public static final String PATH = "/IFC/R36/3625";
            public static final String PATH_CORRECCION = "/IFC/R36/3625/correccion/{folio}";
            public static final String PATH_REENVIO = "/IFC/R36/3625/reenvio/{folio}";
            public static final String CLAVE_REPORTE = "3625";
            public static final String JSON_SCHEMA = "3625_JSON_SCHM";
            public static final String PATH_ENVIO_VACIO = "/IFC/R36/3625/envio-vacio";
            public static final String JSON_SCHEMA_VACIO = "3625_VACIO_JSON_SCHM";
        }
        public static class D_3626 {
            public static final String VALUE = "Información de Financiamientos de Inversionistas.";
            public static final String NOTES = "Este reporte recaba información para identificar la información de los financiamientos en los que cada inversionista colocó sus recursos.";
            public static final String PATH = "/IFC/R36/3626";
            public static final String PATH_CORRECCION = "/IFC/R36/3626/correccion/{folio}";
            public static final String PATH_REENVIO = "/IFC/R36/3626/reenvio/{folio}";
            public static final String CLAVE_REPORTE = "3626";
            public static final String JSON_SCHEMA = "3626_JSON_SCHM";
            public static final String PATH_ENVIO_VACIO = "/IFC/R36/3626/envio-vacio";
            public static final String JSON_SCHEMA_VACIO = "3626_VACIO_JSON_SCHM";
        }
        public static class D_3627 {
            public static final String VALUE = "Información de la venta de derechos o títulos intercambiados.";
            public static final String NOTES = "Este reporte recaba información agregada de las operaciones de mercado secundario llevadas a cabo por la institución en su plataforma.";
            public static final String PATH = "/IFC/R36/3627";
            public static final String PATH_CORRECCION = "/IFC/R36/3627/correccion/{folio}";
            public static final String PATH_REENVIO = "/IFC/R36/3627/reenvio/{folio}";
            public static final String CLAVE_REPORTE = "3627";
            public static final String JSON_SCHEMA = "3627_JSON_SCHM";
            public static final String PATH_ENVIO_VACIO = "/IFC/R36/3627/envio-vacio";
            public static final String JSON_SCHEMA_VACIO = "3627_VACIO_JSON_SCHM";
        }
        public static class D_3628 {
            public static final String VALUE = "Información de comisiones cobradas.";
            public static final String NOTES = "Este reporte recaba información agregada para identificar el tipo y monto de las comisiones pagadas por los clientes de la institución de financiamiento colectiv.";
            public static final String PATH = "/IFC/R36/3628";
            public static final String PATH_CORRECCION = "/IFC/R36/3628/correccion/{folio}";
            public static final String PATH_REENVIO = "/IFC/R36/3628/reenvio/{folio}";
            public static final String CLAVE_REPORTE = "3628";
            public static final String JSON_SCHEMA = "3628_JSON_SCHM";
            public static final String PATH_ENVIO_VACIO = "/IFC/R36/3628/envio-vacio";
            public static final String JSON_SCHEMA_VACIO = "3628_VACIO_JSON_SCHM";
        }
        public static class A_3611 {
            public static final String VALUE = "Movimientos agregados por cuenta.";
            public static final String NOTES = "En este reporte se recaba información referente a los números y saldos de los movimientos de cargos y abonos realizados en moneda nacional o extranjera en las cuentas de los clientes de las Instituciones de Fondos de Pago Electrónico.";
            public static final String PATH = "/IFPE/R36/3611";
            public static final String PATH_CORRECCION = "/IFPE/R36/3611/correccion/{folio}";
            public static final String PATH_REENVIO = "/IFPE/R36/3611/reenvio/{folio}";
            public static final String CLAVE_REPORTE = "3611";
            public static final String JSON_SCHEMA = "3611_JSON_SCHM";
            public static final String PATH_ENVIO_VACIO = "/IFPE/R36/3611/envio-vacio";
            public static final String JSON_SCHEMA_VACIO = "3611_VACIO_JSON_SCHM";
        }
        public static class A_3612 {
            public static final String VALUE = "Sobregiros agregados.";
            public static final String NOTES = "En este reporte se recaba información correspondiente a los sobregiros que otorgan las Instituciones de Fondos de Pago Electrónico.";
            public static final String PATH = "/IFPE/R36/3612";
            public static final String PATH_CORRECCION = "/IFPE/R36/3612/correccion/{folio}";
            public static final String PATH_REENVIO = "/IFPE/R36/3612/reenvio/{folio}";
            public static final String CLAVE_REPORTE = "3612";
            public static final String JSON_SCHEMA = "3612_JSON_SCHM";
            public static final String PATH_ENVIO_VACIO = "/IFPE/R36/3612/envio-vacio";
            public static final String JSON_SCHEMA_VACIO = "3612_VACIO_JSON_SCHM";
        }
        public static class A_3613 {
            public static final String VALUE = "Movimientos en cuentas utilizadas para el manejo de recursos de los clientes.";
            public static final String NOTES = "En este reporte se recaba información correspondiente a detalle de las cuentas o fideicomisos que las Instituciones de Fondos de Pago Electrónico utilizan para el manejo de los recursos de sus clientes.";
            public static final String PATH = "/IFPE/R36/3613";
            public static final String PATH_CORRECCION = "/IFPE/R36/3613/correccion/{folio}";
            public static final String PATH_REENVIO = "/IFPE/R36/3613/reenvio/{folio}";
            public static final String CLAVE_REPORTE = "3613";
            public static final String JSON_SCHEMA = "3613_JSON_SCHM";
            public static final String PATH_ENVIO_VACIO = "/IFPE/R36/3613/envio-vacio";
            public static final String JSON_SCHEMA_VACIO = "3613_VACIO_JSON_SCHM";
        }

    }
    
    public static class ResponseMessages{
        public static final String JSON_TITLE = "titulo";
        public static final String JSON_MSG = "mensaje";
        public static final String JSON_DESC = "descripcion";
        public static final String JSON_KEY = "clave";
        public static final String ERROR_TITLE = "Ocurrió un Error";
        public static final String ERROR_REPORT_NF = "No se encontró el Envío";
        public static final String ERROR_CATALOG_NF = "No se encontró el Catálogo";
        public static final String ERROR_UNAUTHORIZED = "Acceso No Autorizado";
        public static final String ERROR_NOT_FOUND = "No se encontró el registro";
    }

}
