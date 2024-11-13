//package kivi.lms.controller;
//
//import kivi.lms.model.*;
//import kivi.lms.repository.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//@RequestMapping
//public class DetailsController {
//    @Autowired
//    private final CustomerRepository customerRepository;
//    private final LoanRepository loanRepository;
//    private final RepaymentRepository repaymentRepository;
//    private final CollectionRepository collectionRepository;
//    private final DemandRepository demandRepository;
//
//    public DetailsController(CustomerRepository customerRepository, LoanRepository loanRepository, RepaymentRepository repaymentRepository, CollectionRepository collectionRepository, DemandRepository demandRepository) {
//        this.customerRepository = customerRepository;
//        this.loanRepository = loanRepository;
//        this.repaymentRepository = repaymentRepository;
//        this.collectionRepository = collectionRepository;
//        this.demandRepository = demandRepository;
//    }

//    @GetMapping("/details/{id}")
//    public FullDetailsResponse getDetailsById(@PathVariable Integer loanid) {
//        FullDetailsResponse response = new FullDetailsResponse();
//        response.setLoan(loanRepository.findById(loanid).orElse(null));
//        loan loan = loanRepository.findById(loanid).orElse(null);
//        response.setLoan(loan);
//        customer customer = customerRepository.findById(loan.getCustomerid()).orElse(null);
//        if (customer != null) {
//            response.setCustomer(customer);
////        response.setCustomer(customerRepository.findById(id).orElse(null));
//
//            response.setRepayment(repaymentRepository.findById(loan.getLoanid()).orElse(null));
//            response.setCollection(collectionRepository.findById(loanid).orElse(null));
//        response.setDemand(demandRepository.findById(id).orElse(null));

//        customer customer = customerRepository.findById(id).orElse(null);
//        if (customer != null) {
//            response.setCustomer(customer);
//            loan loan = loanRepository.findById(customer.get()).orElse(null);
//            if (loan != null) {
//                response.setLoan(loan);
//                repayment repayment = repaymentRepository.findById(loan.getLoanid()).orElse(null);
//                response.setRepayment(repayment);
//
//                // Fetch collection details using loanid
//                collection collection = collectionRepository.findById(loan.getLoanid()).orElse(null);
//                response.setCollection(collection);
//        loan loan=loanRepository.findById(id).orElse(null);
//        if(loan != null)
//        {
//            response.setLoan(loan);
//            customer customer = customerRepository.findById(loan.getCustomerid()).orElse(null);
//            if (customer != null) {
//                response.setCustomer(customer);
//                repayment repayment = repaymentRepository.findById(loan.getLoanid()).orElse(null);
//                response.setRepayment(repayment);
//            }
//
//        }

//        }
//        return response;
//    }
//
//}


//    @GetMapping("/details/{id}")
//    public FullDetailsResponse getDetailsById(@PathVariable Integer id) {
//        FullDetailsResponse response = new FullDetailsResponse();
//
//        // Fetch the customer details
//        loan loan = loanRepository.findById(id).orElse(null);
//        if (loan != null) {
//            response.setLoan(loan);
//
//            // Fetch the loan associated with the customerid
//            customer customer = customerRepository.findById(loan.getCustomerid()).orElse(null);
//            if (customer != null) {
//                response.setCustomer(customer);
//
//                // Fetch repayment details using loanid
////                repayment repayment = repaymentRepository.findByLoanId(loan.getLoanid()).orElse(null);
////                response.setRepayment(repayment);
//                List<collection> collections = collectionRepository.findByLoanId(loan.getLoanid());
//                response.setCollection((collection) collections);
//
//
//                // Fetch collection details using loanid
////                collection collection = collectionRepository.findByloanid(loan.getLoanid()).orElse(null);
////                response.setCollection(collection);
//
//
//            }
//        }
//
//        return response;
//    }
//}
