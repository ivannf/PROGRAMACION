import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class SAE {
    public Map<Integer, Set<Oferta>> mapaOferta;

    public SAE(){
        mapaOferta = new HashMap<>();
    }

    public Map<Integer, Set<Oferta>> getMapaOferta() {
        return mapaOferta;
    }

    public boolean addOferta(Oferta o){

        if (!mapaOferta.containsKey(o.getOferta())){
            mapaOferta.put(o.getOferta(),new TreeSet<>());
            return false;
        }


        return  mapaOferta.get(o.getOferta()).add(o);
    }

    public boolean addTrabajador(Integer codigo, Trabajadores t){
        if (!mapaOferta.containsKey(codigo)) {
            System.out.println("No existe esta oferta.");
            return false;
        }
        
        return true;
    }

    public boolean removeTrabajador(Integer codigo, Trabajadores t){
        if (!mapaOferta.containsKey(codigo)){
            System.out.println("No hay ofertas con ese codigo");
            return false;
        }

        return mapaOferta.get(codigo).remove(t);
    }

    public void mostrarTrabajadores(Integer codigo){
        if (!mapaOferta.containsKey(codigo)){
            System.out.println("No existe la oferta introducida");
            return;
        }

        System.out.println(mapaOferta.get(codigo));
    }

    public void mostrarTrabajadoresXEdad(Integer codigo){
        Set<Integer> keys = mapaOferta.keySet();
        ArrayList<Oferta> lista = new ArrayList<>();

        for (Integer clave:keys) {
            lista.addAll(mapaOferta.get(clave));
        }

        Collections.sort(lista, new Comparator<Oferta>() {
            @Override
            public int compare(Oferta o1, Oferta o2) {
                return o1.getTrabajador().getEdad()-o2.getTrabajador().getEdad();
            }
        });

        System.out.println(lista);
    }


    public void guardarDatos(){
        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream("sae.dat"));

            Collection<Set<Oferta>> ofertas = mapaOferta.values();
            Iterator it = ofertas.iterator();
            while (it.hasNext()){
                Set<Oferta> oferta = (Set<Oferta>) it.next();

                for (Oferta o1 : oferta){
                    oos.writeObject(o1);
                }
            }
        } catch (Exception e) {

        }finally {
            if (oos!=null){
                try {
                    oos.close();
                } catch (Exception e) {

                }
            }
        }
    }

    public void cargarDatos(){
        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream("sae.dat"));

            while (true) {
                Oferta oferta = (Oferta) ois.readObject();

                System.out.println(oferta);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (Exception E) {

                }
            }
        }
    }
}
