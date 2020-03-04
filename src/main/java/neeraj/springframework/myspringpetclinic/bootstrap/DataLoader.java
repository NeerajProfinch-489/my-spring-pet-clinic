package neeraj.springframework.myspringpetclinic.bootstrap;

import neeraj.springframework.myspringpetclinic.model.Owner;
import neeraj.springframework.myspringpetclinic.model.Vet;
import neeraj.springframework.myspringpetclinic.services.OwnerService;
import neeraj.springframework.myspringpetclinic.services.VetService;
import neeraj.springframework.myspringpetclinic.services.map.OwnerServicesMap;
import neeraj.springframework.myspringpetclinic.services.map.VetServicesMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Neeraj");
        owner1.setLastName("Patel");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Keerthi");
        owner2.setLastName("Keerthi's Last name");

        ownerService.save(owner2);

        System.out.println("Owner loaded....");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Jassie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Vet Loaded......");

    }
}
