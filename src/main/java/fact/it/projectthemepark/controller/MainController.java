package fact.it.projectthemepark.controller;

import fact.it.projectthemepark.model.Attraction;
import fact.it.projectthemepark.model.Staff;
import fact.it.projectthemepark.model.ThemePark;
import fact.it.projectthemepark.model.Visitor;
import jakarta.annotation.PostConstruct;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

@Controller
public class MainController{

    /*  You will need these methods in part 3 of the project assignment. */
    private ArrayList<Staff> staffArrayList;
    private ArrayList<Visitor> visitorArrayList;
    private ArrayList<ThemePark> themeParkArrayList;

    //Write your code here after this line

    /* You will need these methods in part 3 of the project assignment. */
    @PostConstruct
    public void initializeData(){
        staffArrayList = fillStaffMembers();
        visitorArrayList = fillVisitors();
        themeParkArrayList = fillThemeParks();
    }


    private ArrayList<Staff> fillStaffMembers() {
        ArrayList<Staff> staffArrayList = new ArrayList<>();

        Staff staff1 = new Staff("Johan", "Bertels");
        staff1.setStartDate(LocalDate.of(2002, 5, 1));
        Staff staff2 = new Staff("An", "Van Herck");
        staff2.setStartDate(LocalDate.of(2019, 3, 15));
        staff2.setStudent(true);
        Staff staff3 = new Staff("Bruno", "Coenen");
        staff3.setStartDate(LocalDate.of(1995,1,1));
        Staff staff4 = new Staff("Wout", "Dayaert");
        staff4.setStartDate(LocalDate.of(2002, 12, 15));
        Staff staff5 = new Staff("Louis", "Petit");
        staff5.setStartDate(LocalDate.of(2020, 8, 1));
        staff5.setStudent(true);
        Staff staff6 = new Staff("Jean", "Pinot");
        staff6.setStartDate(LocalDate.of(1999,4,1));
        Staff staff7 = new Staff("Ahmad", "Bezeri");
        staff7.setStartDate(LocalDate.of(2009, 5, 1));
        Staff staff8 = new Staff("Hans", "Volzky");
        staff8.setStartDate(LocalDate.of(2015, 6, 10));
        staff8.setStudent(true);
        Staff staff9 = new Staff("Joachim", "Henau");
        staff9.setStartDate(LocalDate.of(2007,9,18));
        staffArrayList.add(staff1);
        staffArrayList.add(staff2);
        staffArrayList.add(staff3);
        staffArrayList.add(staff4);
        staffArrayList.add(staff5);
        staffArrayList.add(staff6);
        staffArrayList.add(staff7);
        staffArrayList.add(staff8);
        staffArrayList.add(staff9);
        return staffArrayList;
    }

 private ArrayList<Visitor> fillVisitors() {
        ArrayList<Visitor> visitorArrayList = new ArrayList<>();
        Visitor visitor1 = new Visitor("Dominik", "Mioens");
        visitor1.setYearOfBirth(2001);
        Visitor visitor2 = new Visitor("Zion", "Noops");
        visitor2.setYearOfBirth(1996);
        Visitor visitor3 = new Visitor("Maria", "Bonetta");
        visitor3.setYearOfBirth(1998);
        Visitor visitor4 = new Visitor("Tri", "Waluyono");
        visitor4.setYearOfBirth(1978);
        visitorArrayList.add(visitor1);
        visitorArrayList.add(visitor2);
        visitorArrayList.add(visitor3);
        visitorArrayList.add(visitor4);
        visitorArrayList.get(0).addToWishList("The big wave");
        visitorArrayList.get(0).addToWishList("Sky Scream");
        visitorArrayList.get(1).addToWishList("Pirate boat");
        visitorArrayList.get(1).addToWishList("Sky Scream");
        visitorArrayList.get(1).addToWishList("Halvar the ride");
        visitorArrayList.get(1).addToWishList("DreamCatcher");
        visitorArrayList.get(2).addToWishList("DinoSplash");
        visitorArrayList.get(3).addToWishList("Sky Scream");
        return visitorArrayList;
    }

    private ArrayList<ThemePark> fillThemeParks() {
        ArrayList<ThemePark> themeParkArrayList = new ArrayList<>();
        ThemePark themepark1 = new ThemePark("Plopsaland");
        ThemePark themepark2 = new ThemePark("Walibi Belgium");
        ThemePark themepark3 = new ThemePark("Holiday Park");
        Attraction attraction1 = new Attraction("Anubis the Ride", 60);
        Attraction attraction2 = new Attraction("The big wave", 180);
        Attraction attraction3 = new Attraction("Pirate boat",150);
        Attraction attraction4 = new Attraction("SuperSplash", 258);
        Attraction attraction5 = new Attraction("Dancing fountains");
        Attraction attraction6 = new Attraction("Halvar the ride",130);
        Attraction attraction7 = new Attraction("DinoSplash", 240);
        Attraction attraction8 = new Attraction("Bounty Tower", 180);
        Attraction attraction9 = new Attraction("Sky Scream",50);
        attraction1.setPhoto("/img/anubis the ride.jpg");
        attraction2.setPhoto("/img/the big wave.jpg");
        attraction3.setPhoto("/img/pirate boat.jpg");
        attraction4.setPhoto("/img/supersplash.jpg");
        attraction5.setPhoto("/img/dancing fountains.jpg");
        attraction6.setPhoto("/img/halvar the ride.jpg");
        attraction7.setPhoto("/img/dinosplash.jpg");
        attraction8.setPhoto("/img/bountytower.jpg");
        attraction9.setPhoto("/img/sky scream.jpg");
        attraction1.setResponsible(staffArrayList.get(0));
        attraction2.setResponsible(staffArrayList.get(1));
        attraction3.setResponsible(staffArrayList.get(2));
        attraction4.setResponsible(staffArrayList.get(3));
        attraction5.setResponsible(staffArrayList.get(4));
        attraction6.setResponsible(staffArrayList.get(5));
        attraction7.setResponsible(staffArrayList.get(6));
        attraction8.setResponsible(staffArrayList.get(7));
        attraction9.setResponsible(staffArrayList.get(8));
        themepark1.addAttraction(attraction1);
        themepark1.addAttraction(attraction2);
        themepark1.addAttraction(attraction3);
        themepark1.addAttraction(attraction4);
        themepark2.addAttraction(attraction5);
        themepark2.addAttraction(attraction6);
        themepark3.addAttraction(attraction7);
        themepark3.addAttraction(attraction8);
        themepark3.addAttraction(attraction9);
        themeParkArrayList.add(themepark1);
        themeParkArrayList.add(themepark2);
        themeParkArrayList.add(themepark3);
        return themeParkArrayList;
    }

    @RequestMapping("/1_newvisitor")
    public String newVisitor (HttpServletRequest request , Model model) {
            model.addAttribute("themeparks",themeParkArrayList);
        return "1_newvisitor";
    }

    @RequestMapping("/visitordetails")
    public String visitorDetails(HttpServletRequest request , Model model){

        String surName = request.getParameter("surName");
        String firstName = request.getParameter("firstName");
        int yearOfBirth = Integer.parseInt(request.getParameter("yearOfBirth"));


        Visitor visitor = new Visitor(surName, firstName);
        visitor.setYearOfBirth(yearOfBirth);

        int themeParkNumber = Integer.parseInt(request.getParameter("parknumber"));
        ThemePark themepark = themeParkArrayList.get(themeParkNumber);
        themepark.registerVisitor(visitor);

        visitorArrayList.add(visitor);
        model.addAttribute("visitor", visitor);

        return "2_wpvisitor";

    }




    @RequestMapping("/3_newstaff")
    public String newStaff(){
        return "3_newstaff";
    }

    @RequestMapping("/staffdetails")
    public String staffdetails(HttpServletRequest request , Model model) {
        String surName = request.getParameter("surName");
        String firstName = request.getParameter("firstName");
        boolean isStudent = Boolean.parseBoolean(request.getParameter("isStudent"));
        String startDate = request.getParameter("employedSince");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Staff staff = new Staff(surName, firstName);
        staff.setStudent(isStudent);
        staff.setStartDate(LocalDate.parse(startDate, formatter));
        model.addAttribute("staff", staff);

        return "4_wpstaff";
    }

    @RequestMapping("/5_staffmemberlist")
    public String staffarraylist (HttpServletRequest request , Model model) {
        model.addAttribute("staffarraylist", staffArrayList);
        return "5_staffmemberlist";
    }

    @RequestMapping("/6_visitorlist")
    public String visitorlist(HttpServletRequest request , Model model) {
        model.addAttribute("visitorlist", visitorArrayList);
        return "6_visitorlist";
    }

    @RequestMapping("/7_newthemepark")
    public String newThemePark(HttpServletRequest request , Model model) {

        return "7_newthemepark";
    }

    @RequestMapping("/newthemepark")
    public String newthemepark(HttpServletRequest request , Model model) {
        String name = request.getParameter("name");

        ThemePark themePark = new ThemePark(name);
        themeParkArrayList.add(themePark);
        model.addAttribute("themeparkarraylist", themeParkArrayList);

        return "8_themeparklist";
    }


    @RequestMapping("/8_themeparklist")
    public String themeparkarraylist(HttpServletRequest request, Model model) {
        model.addAttribute("themeparkarraylist", themeParkArrayList);
        return "8_themeparklist";
    }



    @RequestMapping("/9_newattraction")
    public String newAttraction(HttpServletRequest request , Model model) {
        model.addAttribute("themeparks", themeParkArrayList);
        model.addAttribute("staffarraylist", staffArrayList);
        return "9_newattraction";
    }

    @RequestMapping("/attractionlist")
    public String attractionarraylist(HttpServletRequest request , Model model, ModelMap modelMap) {
        String name = request.getParameter("name");

        Attraction attraction = new Attraction(name);
        attraction.setName(name);

        modelMap.addAttribute("attraction", attraction);
        return "10_attractionlist";
    }














}
